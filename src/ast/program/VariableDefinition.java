package ast.program;

import ast.AbstractLocatable;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class VariableDefinition extends AbstractDefinition {
    Type type;
    private List<String> names;


    public VariableDefinition(Type type,String name, int line, int column) {
        super(name, line, column);
        this.type = type;
        this.names = new ArrayList<>();
        names.add(name);
    }
    public Type getType() {
        return type;
    }
    public List<String> getNames() {
        return names;
    }
    public void addName(String name) {
        names.add(name);
    }
}
