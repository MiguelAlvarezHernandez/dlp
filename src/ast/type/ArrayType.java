package ast.type;

public class ArrayType implements Type {
    private int size;
    private Type elementType;
    public ArrayType( Type elementType, int size) {
        this.size = size;
        this.elementType = elementType;
    }
    public int getSize() {
        return size;
    }
    public Type getElementType() {
        return elementType;
    }




}
