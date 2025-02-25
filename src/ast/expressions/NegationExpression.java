package ast.expressions;

import ast.AbstractLocatable;

public class NegationExpression extends AbstractLocatable implements Expression {
    private Expression expression;

    public NegationExpression(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}