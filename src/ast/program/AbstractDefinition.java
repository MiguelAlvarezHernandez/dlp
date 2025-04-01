package ast.program;

import ast.AbstractLocatable;
import ast.type.Type;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition{
    private String name;
    private int scope;
    private Type type;
    int offset;


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
    public Type getType() {
        return this.type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getOffset() {
        return this.offset;
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
