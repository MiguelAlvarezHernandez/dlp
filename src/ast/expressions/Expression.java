package ast.expressions;

import ast.Locatable;

public interface Expression extends Locatable {

    boolean getLValue();
    void setLValue(boolean value);
}
