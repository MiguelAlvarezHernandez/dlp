package ast.type;

import ast.Locatable;
import semantic.Visitor;

public class ArrayType extends AbstractType {
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
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "size=" + size +
                ", elementType=" + elementType +
                '}';
    }


    @Override
    public Type squareBrackets(Type type, Locatable locatable) {
        if (type instanceof IntType) {
            return elementType;
        }
        return super.squareBrackets(type, locatable);
    }

    @Override
    public int numberOfBytes(){
        return this.size * this.elementType.numberOfBytes();
    }

}
