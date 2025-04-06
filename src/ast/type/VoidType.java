package ast.type;

import ast.Locatable;
import semantic.Visitor;

public class VoidType extends AbstractType {

    @Override
    public String toString() {
        return "VoidType";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public void mustReturnedAs(Type returnType, Locatable locatable) {
        if (!(returnType instanceof VoidType)) {
            new ErrorType(locatable.getLine(), locatable.getColumn(),"Cannot return a value when return type is void.");
        }
    }
}
