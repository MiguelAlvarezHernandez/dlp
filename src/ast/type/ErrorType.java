package ast.type;

import ast.AbstractLocatable;

public class ErrorType extends AbstractLocatable implements Type {
    String message;
    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
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
