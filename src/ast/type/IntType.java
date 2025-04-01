package ast.type;

import ast.Locatable;
import semantic.Visitor;

public class IntType extends AbstractType {

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "IntType";
    }

    @Override
    public Type arithmetic(Type type, Locatable locatable) {
        if(type instanceof IntType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type, locatable);
    }

    @Override
    public Type relational(Type type, Locatable locatable) {
        if(type instanceof IntType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.relational(type, locatable);
    }

    @Override
    public Type modulus(Type type, Locatable locatable) {
        if(type instanceof IntType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type, locatable);
    }

    @Override
    public Type logical(Type type, Locatable locatable) {
        if(type instanceof IntType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.logical(type, locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable) {
        return this;
    }

    @Override
    public Type mustBeCastFrom(Type type, Locatable locatable) {
        if (type instanceof DoubleType || type instanceof CharType || type instanceof IntType) {
            return this;
        }
        return super.mustBeCastFrom(type, locatable);
    }

    @Override
    public void mustBeReadable(Locatable locatable) {}

    @Override
    public void mustBeWritable(Locatable locatable) {}

    @Override
    public void mustBeCondition(Locatable locatable) {}

    @Override
    public void mustReturnedAs(Type returnType, Locatable locatable) {
        if (!(returnType instanceof IntType)) {
            new ErrorType(locatable.getLine(), locatable.getColumn(),"Return type mismatch. Expected: " + returnType);
        }
    }
    @Override
    public Type assignment(Type type, Locatable locatable) {
        if(type instanceof IntType) {
            return this;
        }
        if(type instanceof ErrorType) {
            return this;
        }
        return super.arithmetic(type, locatable);
    }


    public int numberOfBytes() {
        return 2;
    }


}
