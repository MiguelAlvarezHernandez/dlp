package ast.program;

import semantic.Visitor;
import ast.type.Type;

public class VariableDefinition extends AbstractDefinition {
    Type type;


    public VariableDefinition(Type type,String name, int line, int column) {
        super(name, line, column);
        this.type = type;

    }
    public Type getType() {
        return type;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                "type=" + type +
                '}';
    }
}
