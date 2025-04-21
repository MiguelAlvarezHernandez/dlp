import ast.errorhandler.ErrorHandler;
import ast.program.Program;
import codegeneration.AddressCGVisitor;
import codegeneration.CodeGenerator;
import codegeneration.ExecuteCGVisitor;
import codegeneration.ValueCGVisitor;
import semantic.IdentificationVisitor;
import semantic.OffsetVisitor;
import semantic.TypeCheckingVisitor;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import parser.*;

import org.antlr.v4.runtime.*;

public class Main {
	
//	public static void main(String... args) throws Exception {
//		   if (args.length<1) {
//		        System.err.println("Please, pass me the inputSemantic.txt file.");
//		        return;
//		    }
//
//		 // create a lexer that feeds off of inputSemantic.txt CharStream
//		CharStream inputSemantic.txt = CharStreams.fromFileName(args[0]);
//		CmmLexer lexer = new CmmLexer(inputSemantic.txt);
//
//		// create a parser that feeds off the tokens buffer
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		CmmParser parser = new CmmParser(tokens);
////		parser.program();
//		// Modify your previous parser.program() line with:
//		Program ast = parser.program().ast;
//		IntrospectorModel model=new IntrospectorModel("Program", ast);
//		new IntrospectorView("Introspector", model);
//
//	}

	public static void main(String... args) throws Exception {
		if (args.length<1) {
			System.err.println("Please, pass me the inputSemantic.txt file.");
			return;
		}

		// create a lexer that feeds off of inputSemantic.txt CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CmmParser parser = new CmmParser(tokens);
		Program ast = parser.program().ast;
		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(), null);
		ast.accept(new OffsetVisitor(), null);

		if (ErrorHandler.getInstance().anyErrors())
			ErrorHandler.getInstance().showErrors(System.err);
		else {
			// * The AST is shown if no errors exist
			IntrospectorModel model=new IntrospectorModel(
					"Program", ast);
			new IntrospectorView("Introspector", model);


			CodeGenerator cg = new CodeGenerator("output.txt");
			AddressCGVisitor addressVisitor = new AddressCGVisitor(cg);
			ValueCGVisitor valueVisitor = new ValueCGVisitor(cg, addressVisitor);
			ExecuteCGVisitor executeVisitor = new ExecuteCGVisitor(cg, valueVisitor, addressVisitor);

			ast.accept(executeVisitor, null);

			cg.close();

			System.out.println("Code generation completed successfully.");
		}
	}



}
