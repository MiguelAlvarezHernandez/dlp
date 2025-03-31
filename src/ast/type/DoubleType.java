package ast.type;

import semantic.Visitor;

public class DoubleType extends AbstractType{

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "DoubleType";
    }

    @Override
    public Type arithmetic(Type type) {
        if(type instanceof DoubleType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type);
    }

    @Override
    public Type relational(Type type) {
        if(type instanceof DoubleType) {
            return new IntType();
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.relational(type);
    }


    @Override
    public Type arithmetic() {
        return this;
    }

    @Override
    public Type mustBeCastFrom(Type type) {
        if (type instanceof DoubleType || type instanceof CharType || type instanceof IntType) {
            return this;
        }
        return super.mustBeCastFrom(type);
    }

}
