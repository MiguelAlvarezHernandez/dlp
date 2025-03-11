package ast;

import semantic.Visitor;

public interface ASTNode {

    public <TR,TP> TR accept(Visitor<TR,TP> v, TP p);

}
