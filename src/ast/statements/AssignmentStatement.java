package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

public class AssignmentStatement extends AbstractLocatable implements Statement {
    private Expression left;  // Nombre de la variable
    private Expression right;     // Valor a asignar

    public AssignmentStatement(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return left.toString() + " = " + right.toString();
    }

}
