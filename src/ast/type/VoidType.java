package ast.type;

import semantic.Visitor;

public class VoidType implements Type {

    @Override
    public String toString() {
        return "VoidType{}";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }
}
