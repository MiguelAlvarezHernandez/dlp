package ast.program;

import ast.statements.Statement;
import ast.type.FunctionType;
import ast.type.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    private FunctionType functionType; // Tipo de la función, incluye tipo de retorno y parámetros
    private List<VariableDefinition> varDefinitions; // Definiciones de variables en el cuerpo de la función
    private List<Statement> statements; // Instrucciones dentro de la función

    // Constructor para la definición de la función
    public FunctionDefinition(String name, FunctionType functionType,
                              List<VariableDefinition> varDefinitions, List<Statement> statements, int line, int column) {
        super(name,line,column);
        this.functionType = functionType;
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    // Getter para el tipo de la función
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

