package ast.expressions;

import semantic.Visitor;

public class ModuleExpression extends ArithmeticExpression {

    public ModuleExpression(int line, int column, Expression left, Expression right) {
        super(line, column, left, "%", right);
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "ModuleExpression{}";
    }
}

