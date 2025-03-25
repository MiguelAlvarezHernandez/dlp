package ast.type;

import ast.AbstractLocatable;
import ast.errorhandler.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractType {
    String message;
    int line;
    int column;
    public ErrorType(int line, int column, String message) {
        this.message = message;
        this.line = line;
        this.column = column;
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

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }
}
