package ast.statements;

import ast.Locatable;
import ast.type.Type;

public interface Statement extends Locatable {

    Type getReturnType();
    void setReturnType(Type type);
}
