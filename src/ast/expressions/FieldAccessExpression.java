package ast.expressions;

import ast.AbstractLocatable;

public class FieldAccessExpression extends AbstractLocatable implements Expression {
    private Expression record;
    private String field;

    public FieldAccessExpression(Expression record, String field, int line, int column) {
        super(line, column);
        this.record = record;
        this.field = field;
    }

    public Expression getRecord() {
        return record;
    }

    public String getField() {
        return field;
    }
}
