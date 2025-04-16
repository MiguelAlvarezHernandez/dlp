package ast.type;

import ast.Locatable;
import semantic.Visitor;

public class CharType extends AbstractType{

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "CharType";
    }

    @Override
    public Type arithmetic(Type type, Locatable locatable) {
        if(type instanceof CharType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type, locatable);
    }

    @Override
    public Type modulus(Type type, Locatable locatable) {
        if(type instanceof CharType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.modulus(type, locatable);
    }

    @Override
    public Type relational(Type type, Locatable locatable) {
        if(type instanceof CharType) {
            return new IntType();
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.relational(type, locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable) {
        return new IntType();
    }

    @Override
    public Type mustBeCastFrom(Type type, Locatable locatable) {
        if (type instanceof DoubleType || type instanceof CharType || type instanceof IntType) {
            return this;
        }
        return super.mustBeCastFrom(type, locatable);
    }

    @Override
    public Type assignment(Type type,Locatable locatable) {
        if(type instanceof CharType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type, locatable);
    }

    @Override
    public void mustBeReadable(Locatable locatable) {}

    @Override
    public void mustBeWritable(Locatable locatable) {}

    @Override
    public void mustReturnedAs(Type returnType, Locatable locatable) {
        if (!(returnType instanceof CharType)) {
            new ErrorType(locatable.getLine(), locatable.getColumn(), "Return type mismatch. Expected: " + returnType);
        }
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public String suffix(){
        return "b";
    }

    @Override
    public Type superType(Type other) {
        if (other instanceof DoubleType) {
            return new DoubleType();
        } else if (other instanceof IntType) {
            return new IntType();
        }
        return this;
    }
}
