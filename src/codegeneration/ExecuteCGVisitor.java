package codegeneration;

import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.AssignmentStatement;
import ast.statements.ReadStatement;
import ast.statements.WriteStatement;
import ast.type.FunctionType;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {
    /*
    execute[[Assignment: statement -> expression1 expression2]] =
        address[[expression1]]
        value[[expression2]]
        <store> expression1.type.suffix()

    execute[[Read: statement -> expression]] =
        address[[expression]]
        <in> expression.type.suffix()
        <store> expression.type.suffix()

    execute[[Write: statement -> expression]] =
        value[[expression]]
        <out> expression.type.suffix()


    execute[[VariableDefinition: definition -> type ID]] =
        ' * type ID (offset definition.offset)


    execute[[FunctionDefinition: type ID definition* statement*]] =
        ID <:>
        ' * Parameters:
        execute[[type]]
        ' * Local variables:
        definition*.forEach(vd -> execute[[vd]])
        int bytesLocals = definition*.isEmpty() ? 0 :
            -definition*.get(definition*.size()-1).offset;
        <enter > bytesLocals
        statement*.forEach(stmt -> execute[[stmt]])
        <ret> returnBytes, bytesLocals, paramBytes


     execute[[Program: program -> definition*]] =
        ' * Global variables:
        definition*.filter(vd instanceof VariableDefinition)
                   .forEach(vd -> execute[[vd]])
        ' Invocation to the main function
        <call> main
        <halt>
        definition*.filter(fd instanceof FunctionDefinition)
                   .forEach(fd -> execute[[fd]])
     */


    private final CodeGenerator cg;
    private final ValueCGVisitor valueCGVisitor;
    private final AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        this.valueCGVisitor = new ValueCGVisitor(cg);
        this.addressCGVisitor = new AddressCGVisitor(cg);
    }

    @Override
    public Void visit(Program program, Void param) {
        cg.comment("Global variables:");
        program.getDefinitions().stream()
                .filter(d -> d instanceof VariableDefinition)
                .forEach(d -> d.accept(this, null));

        cg.comment("Invocation to the main function");
        cg.call("main");
        cg.halt();

        program.getDefinitions().stream()
                .filter(d -> d instanceof FunctionDefinition)
                .forEach(d -> d.accept(this, null));

        return null;
    }

    @Override
    public Void visit(VariableDefinition varDef, Void param) {
        cg.comment(String.format("* %s %s (offset %d)",
                varDef.getType(), varDef.getName(), varDef.getOffset()));
        return null;
    }

    @Override
    public Void visit(FunctionDefinition funcDef, Void param) {
        cg.label(funcDef.getName());
        cg.comment("* Parameters:");
        ((FunctionType) funcDef.getType()).getParameterTypes().forEach(p -> p.accept(this, null));

        cg.comment("* Local variables:");
        funcDef.getVarDefinitions().forEach(d -> d.accept(this, null));

        int bytesLocals = funcDef.getVarDefinitions().isEmpty() ? 0 :
                -funcDef.getVarDefinitions()
                        .get(funcDef.getVarDefinitions().size() - 1)
                        .getOffset();

        cg.enter(bytesLocals);

        funcDef.getStatements().forEach(s -> s.accept(this, null));

        FunctionType fType = (FunctionType) funcDef.getType();
        int returnBytes = fType.getReturnType().numberOfBytes();
        int paramBytes = fType.getParameterTypes().stream().mapToInt(p -> p.getType().numberOfBytes()).sum();

        cg.ret(returnBytes, bytesLocals, paramBytes);

        return null;
    }

    @Override
    public Void visit(AssignmentStatement assignment, Void param) {
        assignment.getLeft().accept(addressCGVisitor, null);
        assignment.getRight().accept(valueCGVisitor, null);
        cg.store(assignment.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(ReadStatement read, Void param) {
        read.getValueToRead().accept(addressCGVisitor, null);
        cg.in(read.getValueToRead().getType());
        cg.store(read.getValueToRead().getType());
        return null;
    }

    @Override
    public Void visit(WriteStatement write, Void param) {
        write.getValueToWrite().accept(valueCGVisitor, null);
        cg.out(write.getValueToWrite().getType());
        return null;
    }
}
