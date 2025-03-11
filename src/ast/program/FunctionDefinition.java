package ast.program;

import semantic.Visitor;
import ast.statements.Statement;
import ast.type.FunctionType;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    private FunctionType functionType;
    private List<VariableDefinition> varDefinitions;
    private List<Statement> statements;

    public FunctionDefinition(String name, FunctionType functionType,
                              List<VariableDefinition> varDefinitions, List<Statement> statements, int line, int column) {
        super(name,line,column);
        this.functionType = functionType;
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }




    public List<VariableDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                "functionType=" + functionType +
                ", varDefinitions=" + varDefinitions +
                ", statements=" + statements +
                '}';
    }
}

