package xyz.lexteam.mars.compiler.lexer;

/**
 * Represents a token.
 */
public class Token {

    private final Type type;

    public Token(Type type) {
        this.type = type;
    }

    /**
     * Gets the type of the token.
     *
     * @return The type
     */
    public Type getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Token(type: " + this.type + ")";
    }

    /**
     * Represents the type of the token.
     */
    enum Type {
        PACKAGE,
        STRING,
        KEYWORD,
    }
}
