package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

public class AssignmentStatement extends AbstractLocatable implements Statement {
    private String variableName;  // Nombre de la variable
    private Expression value;     // Valor a asignar

    public AssignmentStatement(String variableName, Expression value, int line, int column) {
        super(line, column);
        this.variableName = variableName;
        this.value = value;
    }
    @Override
    public String toString() {
        return variableName + " = " + value.toString();
    }

}
