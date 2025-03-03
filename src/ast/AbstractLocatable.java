package ast;

public class AbstractLocatable implements Locatable{
    private int line;
    private int column;

    public AbstractLocatable(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "AbstractLocatable{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
