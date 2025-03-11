package ast.expressions;

import semantic.Visitor;

public class CharLiteralExpression extends AbstractExpression{
    private char value;

    public CharLiteralExpression(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "CharLiteralExpression{" +
                "value=" + value +
                '}';
    }


}