package ast.statements;

import ast.AbstractLocatable;
import ast.type.Type;

public abstract class AbstractStatement extends AbstractLocatable implements Statement{


//    private Type returnType;//No because it is temporal so it should not be annotated in the ast

    public AbstractStatement(int line, int column) {
        super(line, column);
    }


//    @Override
//    public Type getReturnType() {
//        return returnType;
//    }
//
//    @Override
//    public void setReturnType(Type type) {
//        this.returnType = type;
//    }
}
