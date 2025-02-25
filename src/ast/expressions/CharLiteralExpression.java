package ast.expressions;

import ast.AbstractLocatable;

public class CharLiteralExpression extends AbstractLocatable implements Expression {
    private char value;

    public CharLiteralExpression(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}