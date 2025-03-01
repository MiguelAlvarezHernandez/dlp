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
        StringBuilder sb = new StringBuilder();
        sb.append(functionType.getReturnType().toString()).append(" ");
        sb.append(super.getName()).append("(");

        List<VariableDefinition> parameters = functionType.getParameterTypes();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).getType().toString())
                    .append(" ").append(parameters.get(i).getName());
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") {\n");

        for (VariableDefinition varDef : varDefinitions) {
            sb.append("    ").append(varDef.toString()).append(";\n");
        }

        for (Statement statement : statements) {
            sb.append("    ").append(statement.toString()).append("\n");
        }
        sb.append("}");

        return sb.toString();
    }
}

