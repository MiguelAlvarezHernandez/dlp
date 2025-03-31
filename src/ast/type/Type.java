package ast.type;

import ast.ASTNode;

import java.util.List;

public interface Type extends ASTNode {
    void mustReturnedAs(Type returnType);

    Type assignment(Type type);

    Type parenthesis(List<Type> argTypes);

    void mustBeWritable();

    void mustBeReadable();

    void mustBeCondition();

    Type arithmetic(Type type);

    Type arithmetic();

    Type mustBeCastFrom(Type type);

    Type squareBrackets(Type type);

    Type relational(Type type);

    Type accessField(Type type);

    Type logical(Type type);

    Type modulus(Type type);

}

