package ast.expressions;

import semantic.Visitor;

public class UnaryMinusExpression extends AbstractExpression {
    private Expression expression;

    public UnaryMinusExpression(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "UnaryMinusExpression{" +
                "expression=" + expression +
                '}';
    }
}