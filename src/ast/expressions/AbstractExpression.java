package ast.expressions;

import ast.AbstractLocatable;
import ast.type.Type;

public abstract class AbstractExpression extends AbstractLocatable implements Expression{
    private boolean lvalue;
    private Type type;

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

    @Override
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
