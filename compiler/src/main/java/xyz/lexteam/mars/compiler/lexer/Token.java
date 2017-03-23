package xyz.lexteam.mars.compiler.lexer;

import com.google.common.base.MoreObjects;

/**
 * Represents a token.
 */
public class Token {

    private final Type type;

    Token(Type type) {
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
        return MoreObjects.toStringHelper(this)
                .add("type", this.type)
                .toString();
    }

    /**
     * Represents the type of the token.
     */
    enum Type {
        STRING,
        KEYWORD,
    }

}
