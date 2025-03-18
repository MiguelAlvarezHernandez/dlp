package ast.program;

import ast.AbstractLocatable;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition{
    private String name;
    int scope;


    public AbstractDefinition(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public int getScope() {
        return this.scope;
    }
    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractDefinition{" +
                "name='" + name + '\'' +
                '}';
    }
}
