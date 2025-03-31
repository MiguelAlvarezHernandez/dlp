package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

public class AssignmentStatement extends AbstractStatement {
    private Expression left;  // Nombre de la variable
    private Expression right;     // Valor a asignar

    public AssignmentStatement(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return left.toString() + " = " + right.toString();
    }

}
