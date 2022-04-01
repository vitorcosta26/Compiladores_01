package main;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import compilador.sintaticoLexer;
import compilador.sintaticoParser;
import listener.ErrorListener;
import visitor.Visitor;

public class Main {
	
	public static void main(String[] args) {
		
		String fileName = "";
		try (Scanner entrada = new Scanner(System.in)) {
			//System.out.println("DIGITE O NOME DO ARQUIVO QUE CONTEM O CODIGO DO PROGRAMA!");
			//fileName = entrada.nextLine();
			fileName = "prog.txt";
			//fileName = "input.txt";
			//fileName = "erroLexico.txt";
			//fileName = "erroSintatico.txt";
			System.out.println("\n---------------------------------------------------------\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);
			sintaticoLexer lexer = new sintaticoLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			sintaticoParser parser = new sintaticoParser(tokens);
			
			parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
			parser.addErrorListener(new ErrorListener());
			
			if (ErrorListener.hasError) {
				
			} else {
				
				getTokens(lexer);
				
				ParseTree parseTree = parser.prog();
				
				Visitor visitor = new Visitor();
				visitor.visit(parseTree);
				
				System.out.println("\n---------------------------------------------------------\n");
				System.out.println("ANALISE COMPLETA");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void getTokens(sintaticoLexer lexer) {
		
		Token token = null;
		
		lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
		
		while(((token = lexer.nextToken()).getType() != Token.EOF)) {
			System.out.println("['"+token.getText()
								+"' - <"+sintaticoLexer.VOCABULARY.getDisplayName(token.getType())
								+">, linha: "+token.getLine()
								+":"+(token.getCharPositionInLine() + 1)+"]");
		}
		
		lexer.addErrorListener(ConsoleErrorListener.INSTANCE);
		
		lexer.reset();
	}
}
