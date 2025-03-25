package ast.expressions;

import ast.Locatable;
import ast.type.Type;

public interface Expression extends Locatable {

    boolean getLValue();
    void setLValue(boolean value);

    Type getType();
    void setType(Type type);
}
