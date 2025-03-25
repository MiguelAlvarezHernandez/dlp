package ast.type;

import semantic.Visitor;

public class AbstractType implements Type{

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return null;
    }
}
