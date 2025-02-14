package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		if (str.length() == 3 && str.startsWith("'") && str.endsWith("'")) {
			return str.charAt(1);
		} else if (str.length() >= 4 && str.startsWith("'\\") && str.endsWith("'")) {
			if (str.charAt(2) == 'n') return '\n';
			if (str.charAt(2) == 't') return '\t';
			try {
				return (char) Integer.parseInt(str.substring(2, str.length() - 1));
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}
		throw new IllegalArgumentException("Invalid character constant: " + str);
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return Double.NaN;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
