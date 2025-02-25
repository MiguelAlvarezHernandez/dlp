package ast.statements;

import ast.AbstractLocatable;

public class ReadStatement extends AbstractLocatable implements Statement {
    private String variableName;

    public ReadStatement(String variableName, int line, int column) {
        super(line, column);
        this.variableName = variableName;
    }
    @Override
    public String toString() {
        return "Read " + variableName;
    }
}
