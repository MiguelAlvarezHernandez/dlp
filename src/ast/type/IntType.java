package ast.type;

import semantic.Visitor;

public class IntType implements Type {

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "IntType{}";
    }
}
