package listener;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorListener extends BaseErrorListener {
	
	public static boolean hasError = false;
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol,
			int line,
			int charPositionInLine,
			String msg,
			RecognitionException e) {
		
		hasError = true;
		
		System.err.println("<" + ((Token) offendingSymbol).getText() + "> linha " + line + ":" + charPositionInLine + " " + msg);
	}

}
