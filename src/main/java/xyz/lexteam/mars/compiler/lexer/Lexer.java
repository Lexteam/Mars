package xyz.lexteam.mars.compiler.lexer;

import xyz.lexteam.mars.compiler.Keyword;

import java.util.ArrayList;
import java.util.List;

/**
 * The Mars lexer.
 */
public final class Lexer {

    public static List<Token> lex(String content) {
        final char[] contents = content.toCharArray();
        final List<Token> tokens = new ArrayList<Token>();

        String token = "";
        State state = State.DEFAULT;

        // Stuff for strings
        String str = "";

        for (char character : contents) {

            switch (state) {
                case DEFAULT:
                    // Check for unknown tokens
                    if (character == ' ' || character == '\n') {
                        // check if its an unknown token
                        if (!token.equals("")) {
                            System.out.println("Unknown token found: " + token);
                        }

                        // reset token
                        token = "";
                    } else {
                        // set token
                        token += character;
                    }

                    // look for tokens
                    if (token.equals("package")) { // package
                        tokens.add(new Token(Token.Type.PACKAGE));
                        token = ""; // reset token
                    } else if (token.equals("\"")) { // string
                        state = State.STRING;
                        token = ""; // reset token
                    } else if (Keyword.isKeyword(token)) {
                        tokens.add(new TokenKeyword(Keyword.getKeyword(token)));
                        token = ""; // reset token
                    }
                    break;
                case STRING:
                    // set token
                    token += character;

                    // check if string has ended
                    if (token.equals("\"")) {
                        // add token
                        tokens.add(new TokenString(str));
                        // reset values
                        token = "";
                        state = State.DEFAULT;
                        str = "";
                    } else {
                        // add token to string
                        str += token;
                        token = ""; // reset token
                    }
                    break;
            }
        }

        return tokens;
    }

    private enum State {
        DEFAULT,
        STRING
    }

}
