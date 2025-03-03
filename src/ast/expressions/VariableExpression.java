package ast.expressions;

import ast.AbstractLocatable;

public class VariableExpression extends AbstractLocatable implements Expression {
    private String name;

    public VariableExpression(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VariableExpression{" +
                "name='" + name + '\'' +
                '}';
    }
}