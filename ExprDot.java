import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ExprDot{
	public static void main(String[] args) throws Exception{
		String inputFile = null;
		if(args.length > 0)inputFile = args[0];
		InputStream is = System.in;
		if(inputFile != null) is = new FileInputStream(inputFile);
		CharStream input = CharStreams.fromStream(is);
		DotLexer lexer = new DotLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DotParser parser = new DotParser(tokens);
		ParseTree tree = parser.program();
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
		
		System.out.println(tree.toStringTree(parser));

		/* Show Adjacency List*/
		eval.ShowMemory();


		/* Save Adjacency List*/
		eval.SaveSymbolTable();
	}
}
