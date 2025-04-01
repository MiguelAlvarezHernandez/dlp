package ast.type;

import ast.ASTNode;
import ast.Locatable;

import java.util.List;

public interface Type extends ASTNode {
    void mustReturnedAs(Type returnType, Locatable locatable);

    Type assignment(Type type, Locatable locatable);

    Type parenthesis(List<Type> argTypes, Locatable locatable);

    void mustBeWritable(Locatable locatable);

    void mustBeReadable(Locatable locatable);

    void mustBeCondition(Locatable locatable);

    Type arithmetic(Type type, Locatable locatable);

    Type arithmetic(Locatable locatable);

    Type mustBeCastFrom(Type type, Locatable locatable);

    Type squareBrackets(Type type, Locatable locatable);

    Type relational(Type type, Locatable locatable);

    Type accessField(String fieldName, Locatable locatable);

    Type logical(Type type, Locatable locatable);

    Type modulus(Type type, Locatable locatable);

    int numberOfBytes();

}

