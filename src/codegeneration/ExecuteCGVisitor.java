package codegeneration;

import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.FunctionType;
import ast.type.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,DtoBytes> {
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
        <' * Local variables:>
        definition*.forEach(vd -> execute[[vd]])
        int bytesLocals = definition*.isEmpty() ? 0 :
            -definition*.get(definition*.size()-1).offset;
        <enter > bytesLocals
        statement*.forEach(stmt -> execute[[stmt]]execute[[stmt]](bytesLocals, bytesParams, bytesReturn))
        <ret> returnBytes, bytesLocals, paramBytes


     execute[[Program: program -> definition*]] =
        <' * Global variables:>
        definition*.filter(vd instanceof VariableDefinition)
                   .forEach(vd -> execute[[vd]])
        <' Invocation to the main function>
        <call> main
        <halt>
        definition*.filter(fd instanceof FunctionDefinition)
                   .forEach(fd -> execute[[fd]])


     execute[[While statement -> expression statement* ]]=
        String conditionLabel = cg.nextLabel(),
                exitLabel = cg.nextLabel();
        conditionLabel<:>
        value [[expression]]
        <jz > exitLabel
        <' * Body of the while statement>
        statement*.forEach(stmt -> execute[[stmt]])
        <jmp > conditionLabel
        exitLabel<:>


     execute[[IfElseStatement statement -> expression statement1* statement2*]]=
        String elseLabel = cg.nextLabel(),
                exitLabel = cg.nextLabel();
         value[[expression]]
         <jz > elseLabel
         <' * Body of the if branch>
         statement2*.forEach(stmt -> execute[[stmt]])
         <jmp > exitLabel
         elseLabel<:>
         <' * Body of the else branch>
         statement1*.forEach(stmt -> execute[[stmt]])
         exitLabel<:>


    execute[[FunctionInvocation: statement → exp1 exp2*]] =
        exp2*.forEach(exp -> value[[exp]])
        <call > exp1.name
        if(!(exp1.type.returnType instanceof VoidType))
            <pop> exp1.type.returnType.suffix()


    execute[[Return: statement → exp]](int bytesLocals, int bytesParams, int bytesReturn) =
        value[[exp]]
        ret bytesReturn , bytesLocals , bytesParams
     */


    private final CodeGenerator cg;
    private final ValueCGVisitor valueCGVisitor;
    private final AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg, ValueCGVisitor valueCGVisitor, AddressCGVisitor addressCGVisitor) {
        this.cg = cg;
        this.valueCGVisitor = valueCGVisitor;
        this.addressCGVisitor = addressCGVisitor;

    }

    @Override
    public Void visit(ReturnStatement returnStatement, DtoBytes param) {
        cg.comment("line\t"+ returnStatement.getLine());

        returnStatement.getReturnValue().accept(valueCGVisitor, null);
        cg.ret(param.bytesReturn(), param.bytesLocals(), param.bytesParams());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, DtoBytes param) {
        cg.comment("line\t"+ functionInvocation.getLine());


        functionInvocation.getArguments().forEach(exp -> exp.accept(valueCGVisitor, null));
        cg.call(functionInvocation.getVariable().getName());
        if(!(((FunctionType)functionInvocation.getVariable().getType()).getReturnType() instanceof VoidType))
            cg.pop(((FunctionType)functionInvocation.getVariable().getType()).getReturnType().suffix());
        return null;
    }

    @Override
    public Void visit(IfElseStatement ifElseStatement, DtoBytes param) {
        cg.comment("line\t"+ ifElseStatement.getLine());
        cg.nextLabel();
        String elseLabel = cg.getCurrentLabel();
        cg.nextLabel();
        String exitLabel = cg.getCurrentLabel();
        ifElseStatement.getConditionExpression().accept(valueCGVisitor, null);
        cg.jump("jz", elseLabel);
        cg.comment("* Body of the if branch");
        ifElseStatement.getIfBody().forEach(s -> s.accept(this, param));
        cg.jump("jmp", exitLabel);
        cg.commentLabel(elseLabel);
        cg.comment("* Body of the else branch");
        ifElseStatement.getElseBody().forEach(s -> s.accept(this, param));
        cg.commentLabel(exitLabel);

        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement, DtoBytes param) {
        cg.comment("line\t"+ whileStatement.getLine());

        cg.nextLabel();
        String conditionLabel = cg.getCurrentLabel();
        cg.nextLabel();
        String exitLabel = cg.getCurrentLabel();
        cg.commentLabel(conditionLabel);
        whileStatement.getCondition().accept(valueCGVisitor, null);
        cg.jump("jz", exitLabel);
        cg.comment("* Body of the while statement");
        whileStatement.getBody().forEach(s -> s.accept(this, param));
        cg.jump("jmp", conditionLabel);
        cg.commentLabel(exitLabel);
        return null;
    }

    @Override
    public Void visit(Program program, DtoBytes param) {
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
    public Void visit(VariableDefinition varDef, DtoBytes param) {
        cg.comment(String.format("* %s %s (offset %d)",
                varDef.getType(), varDef.getName(), varDef.getOffset()));
        return null;
    }

    @Override
    public Void visit(FunctionDefinition funcDef, DtoBytes param) {
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

        FunctionType fType = (FunctionType) funcDef.getType();
        int returnBytes = fType.getReturnType().numberOfBytes();
        int paramBytes = fType.getParameterTypes().stream().mapToInt(p -> p.getType().numberOfBytes()).sum();

        DtoBytes dtoBytes = new DtoBytes(returnBytes, bytesLocals, paramBytes);
        funcDef.getStatements().forEach(s -> s.accept(this, dtoBytes));

        if(fType.getReturnType() instanceof VoidType)
            cg.ret(returnBytes, bytesLocals, paramBytes);

        return null;
    }

    @Override
    public Void visit(AssignmentStatement assignment, DtoBytes param) {
        cg.comment("line\t"+ assignment.getLine());

        assignment.getLeft().accept(addressCGVisitor, null);
        assignment.getRight().accept(valueCGVisitor, null);
        cg.store(assignment.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(ReadStatement read, DtoBytes param) {
        cg.comment("line\t"+ read.getLine());

        read.getValueToRead().accept(addressCGVisitor, null);
        cg.in(read.getValueToRead().getType());
        cg.store(read.getValueToRead().getType());
        return null;
    }

    @Override
    public Void visit(WriteStatement write, DtoBytes param) {
        cg.comment("line\t"+ write.getLine());

        write.getValueToWrite().accept(valueCGVisitor, null);
        cg.out(write.getValueToWrite().getType());
        return null;
    }
}
