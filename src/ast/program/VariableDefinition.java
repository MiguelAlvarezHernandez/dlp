package ast.program;

import ast.AbstractLocatable;

public class VariableDefinition extends AbstractDefinition {

    public VariableDefinition(String name, int line, int column) {
        super(name, line, column);
    }
}
