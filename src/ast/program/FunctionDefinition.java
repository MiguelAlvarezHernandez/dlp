package ast.program;

import ast.statements.Statement;
import ast.type.FunctionType;
import ast.type.Type;

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
    public String toString() {
        return "FunctionDefinition{" +
                "functionType=" + functionType +
                ", varDefinitions=" + varDefinitions +
                ", statements=" + statements +
                '}';
    }
}

