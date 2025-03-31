package ast.type;

import ast.Locatable;

import java.util.List;

public abstract class AbstractType implements Type{

    @Override
    public Type arithmetic(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid arithmetic operation");
    }

    @Override
    public Type arithmetic(Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid arithmetic operation");
    }

    @Override
    public Type modulus(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid modulus operation");
    }

    @Override
    public Type logical(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid logical operation");
    }

    @Override
    public void mustReturnedAs(Type type, Locatable locatable) {
        new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid return value");
    }

    @Override
    public Type assignment(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid assignment operation");
    }

    @Override
    public Type relational(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid relational operation");
    }

    @Override
    public Type mustBeCastFrom(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid cast operation");
    }

    @Override
    public Type squareBrackets(Type type, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid indexing operation");
    }

    @Override
    public Type accessField(String fieldName, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid field access");
    }

    @Override
    public Type parenthesis(List<Type> arguments, Locatable locatable) {
        return new ErrorType(locatable.getLine(),locatable.getColumn(),"Invalid function invocation");
    }

    @Override
    public void mustBeCondition(Locatable locatable) {
        new ErrorType(locatable.getLine(),locatable.getColumn(),"Condition must be of type int");
    }

    @Override
    public void mustBeReadable(Locatable locatable) {
        new ErrorType(locatable.getLine(),locatable.getColumn(),"Expression must be readable");
    }

    @Override
    public void mustBeWritable(Locatable locatable) {
        new ErrorType(locatable.getLine(),locatable.getColumn(),"Expression must be writable");
    }

    @Override
    public boolean equals(Object obj) {

        return this.getClass() == obj.getClass();
    }

}
