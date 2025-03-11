package ast.type;

import ast.AbstractLocatable;
import ast.errorhandler.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractLocatable implements Type {
    String message;
    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "message='" + message + '\'' +
                "in line " + getLine() +
                ", and column " + getColumn() +
                '}';
    }

}
