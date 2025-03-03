package ast.program;

import ast.AbstractLocatable;

public class AbstractDefinition extends AbstractLocatable implements Definition{
    private String name;

    public AbstractDefinition(String name, int line, int column) {
        super(line, column);
        this.name = name;
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
