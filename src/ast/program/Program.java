package ast.program;

import ast.ASTNode;

import java.util.List;

public class Program implements ASTNode {
    List<Definition> definitions;

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitions=" + definitions +
                '}';
    }
}
