package ast.expressions;

import ast.AbstractLocatable;

public abstract class AbstractExpression extends AbstractLocatable implements Expression{
    private boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return lvalue;
    }

    @Override
    public void setLValue(boolean value) {
        this.lvalue=value;
    }
}
