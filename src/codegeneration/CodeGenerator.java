package codegeneration;

import ast.type.CharType;
import ast.type.DoubleType;
import ast.type.IntType;
import ast.type.Type;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    public CodeGenerator(String outputFilename) {
        try {
            out = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException e) {
            throw new RuntimeException("Cannot create output file: " + outputFilename, e);
        }
    }

    public void push(int value) {
        out.println("\tpushi\t" + value);
    }

    public void push(char value) {
        out.println("\tpushb\t" + (int) value);
    }

    public void push(double value) {
        out.println("\tpushf\t" + value);
    }

    public void pushAddress(int offset) {
        out.println("\tpusha\t" + offset);
    }

    public void pushBP() {
        out.println("\tpush\tbp");
    }

    public void add(Type type) {
        out.println("\taddi");
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
    }

    public void store(Type type) {
        out.println("\tstore" + type.suffix());
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
    }

    public void in(Type type) {
        out.println("\tinf");
    }

    public void ret(int returnBytes, int localBytes, int paramBytes) {
        out.println("\tret\t" + returnBytes + ", " + localBytes + ", " + paramBytes);
    }

    public void enter(int bytes) {
        out.println("\tenter\t" + bytes);
    }

    public void call(String functionName) {
        out.println("\tcall\t" + functionName);
    }

    public void halt() {
        out.println("\thalt");
    }

    public void comment(String comment) {
        out.println("\t' " + comment);
    }

    public void line(int line) {
        out.println("\n#line\t" + line);
    }

    public void logical(String operator) {
        switch (operator) {
            case "&&": out.println("\tand"); break;
            case "||": out.println("\tor"); break;
            case "!": out.println("\tnot"); break;
            default: throw new UnsupportedOperationException("Operador lógico no soportado: " + operator);

        }
    }

    public void arithmetic(String operator, String suffix) {
        switch (operator) {
            case "+": out.println("\tadd" + suffix); break;
            case "-": out.println("\tsub" + suffix); break;
            case "*": out.println("\tmul" + suffix); break;
            case "/": out.println("\tdiv" + suffix); break;
            default: throw new UnsupportedOperationException("Operador lógico no soportado: " + operator);

        }
    }

    public void modulus(String suffix) {
        out.println("\tmod" + suffix);
    }

    public void relational(String operator, String suffix) {
        switch (operator) {
            case "<": out.println("\tlt" + suffix); break;
            case ">": out.println("\tgt" + suffix); break;
            case "<=": out.println("\tle" + suffix); break;
            case ">=": out.println("\tge" + suffix); break;
            case "==": out.println("\teq" + suffix); break;
            case "!=": out.println("\tne" + suffix); break;
            default: throw new UnsupportedOperationException("Operador lógico no soportado: " + operator);

        }
    }

    public void label(String name) {
        out.println(name + ":");
    }

    public void close() {
        out.close();
    }


    public void convert(Type targetType, Type sourceType) {
        if (targetType.equals(sourceType)) {
            return;
        }
        if (sourceType instanceof IntType) {
            convertIntTo(targetType);
        } else if (sourceType instanceof DoubleType) {
            convertRealTo(targetType);
        } else if (sourceType instanceof CharType) {
            convertCharTo(targetType);
        } else {
            throw new IllegalArgumentException("Unsupported type conversion from " + sourceType.getClass().getSimpleName() +
                    " to " + targetType.getClass().getSimpleName());
        }
    }

    private void convertIntTo(Type targetType) {
        if (targetType instanceof DoubleType) {
            out.println("\tint2float");
        } else if (targetType instanceof CharType) {
            out.println("\tint2char");
        } else {
            throw new IllegalArgumentException("Cannot convert int to " + targetType.getClass().getSimpleName());
        }
    }

    private void convertRealTo(Type targetType) {
        if (targetType instanceof IntType) {
            out.println("\tfloat2int");
        } else if (targetType instanceof CharType) {
            out.println("\tfloat2char");
        } else {
            throw new IllegalArgumentException("Cannot convert float to " + targetType.getClass().getSimpleName());
        }
    }

    private void convertCharTo(Type targetType) {
        if (targetType instanceof IntType) {
            out.println("\tchar2int");
        } else if (targetType instanceof DoubleType) {
            out.println("\tchar2float");
        } else {
            throw new IllegalArgumentException("Cannot convert char to " + targetType.getClass().getSimpleName());
        }
    }
}
