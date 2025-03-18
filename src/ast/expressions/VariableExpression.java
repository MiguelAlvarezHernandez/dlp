package ast.expressions;

import ast.program.Definition;
import semantic.Visitor;

public class VariableExpression extends AbstractExpression {
    private String name;
    Definition definition;

    public VariableExpression(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "VariableExpression{" +
                "name='" + name + '\'' +
                '}';
    }

    public Definition getDefinition() {
        return definition;
    }
    public void setDefinition(Definition definition) {
        this.definition = definition;
    }
}