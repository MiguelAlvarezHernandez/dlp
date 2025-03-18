package ast.program;


import ast.Locatable;

public interface Definition extends Locatable {
    String getName();

    void setScope(int scope);
}
