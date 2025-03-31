package ast.type;

import java.util.List;

public abstract class AbstractType implements Type{

    @Override
    public Type arithmetic(Type type) {
        return new ErrorType("Invalid arithmetic operation");
    }

    @Override
    public Type arithmetic() {
        return new ErrorType("Invalid arithmetic operation");
    }

    @Override
    public Type modulus(Type type) {
        return new ErrorType("Invalid modulus operation");
    }

    @Override
    public Type logical(Type type) {
        return new ErrorType("Invalid logical operation");
    }

    @Override
    public void mustReturnedAs(Type type) {
        new ErrorType("Invalid return value");
    }

    @Override
    public Type assignment(Type type) {
        return new ErrorType("Invalid assignment operation");
    }

    @Override
    public Type relational(Type type) {
        return new ErrorType("Invalid relational operation");
    }

    @Override
    public Type mustBeCastFrom(Type type) {
        return new ErrorType("Invalid cast operation");
    }

    @Override
    public Type squareBrackets(Type type) {
        return new ErrorType("Invalid indexing operation");
    }

    @Override
    public Type accessField(Type field) {
        return new ErrorType("Invalid field access");
    }

    @Override
    public Type parenthesis(List<Type> arguments) {
        return new ErrorType("Invalid function invocation");
    }

    @Override
    public void mustBeCondition() {
        new ErrorType("Condition must be of type int");
    }

    @Override
    public void mustBeReadable() {
        new ErrorType("Expression must be readable");
    }

    @Override
    public void mustBeWritable() {
        new ErrorType("Expression must be writable");
    }

}
