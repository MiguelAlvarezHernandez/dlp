package ast.expressions;

import ast.AbstractLocatable;

public class IndexExpression extends AbstractLocatable implements Expression {
    private Expression array;
    private Expression index;

    public IndexExpression(Expression array, Expression index, int line, int column) {
        super(line, column);
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

}