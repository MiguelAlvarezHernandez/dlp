package ast.errorhandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler instance = new ErrorHandler();
    private List<ErrorType> errors;

    private ErrorHandler() {
        errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        return instance;
    }

    public boolean anyErrors(){
        return errors.size() > 0;
    }

    public void showErrors(PrintStream out){
        for(ErrorType error : errors){
            out.println(error.toString());
        }
    }

    public void addError(ErrorType error){
        errors.add(error);
    }

}
