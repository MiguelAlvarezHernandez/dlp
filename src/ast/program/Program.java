package ast.program;

import ast.ASTNode;
import semantic.Visitor;

import java.util.List;

public class Program implements ASTNode {
    List<Definition> definitions;

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitions=" + definitions +
                '}';
    }
}
