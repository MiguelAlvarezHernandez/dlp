package ast.type;

import semantic.Visitor;

public class DoubleType extends AbstractType{

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "DoubleType{}";
    }
}
