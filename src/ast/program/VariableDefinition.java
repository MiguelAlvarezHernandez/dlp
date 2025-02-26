package ast.program;

import ast.AbstractLocatable;
import ast.type.Type;

public class VariableDefinition extends AbstractDefinition {
    Type type;
    public VariableDefinition(Type type,String name, int line, int column) {
        super(name, line, column);
        this.type = type;
    }
}
