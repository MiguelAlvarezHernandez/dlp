package ast.program;


import ast.Locatable;
import ast.type.Type;

public interface Definition extends Locatable {
    String getName();

    void setScope(int scope);

    Type getType();

    int getScope();

    int getOffset();
}
