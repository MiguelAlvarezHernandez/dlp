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



    public static Type create(Type elementType, int size) {
        if (elementType instanceof ArrayType) {
            ArrayType current = (ArrayType) elementType;
            while (current.elementType instanceof ArrayType) {
                current = (ArrayType) current.elementType;
            }
            current.elementType = new ArrayType(current.elementType, size);
            return elementType;
        } else {
            return new ArrayType(elementType, size);
        }
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "size=" + size +
                ", elementType=" + elementType +
                '}';
    }
}
