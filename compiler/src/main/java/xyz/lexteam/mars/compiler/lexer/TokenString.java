package xyz.lexteam.mars.compiler.lexer;

import com.google.common.base.MoreObjects;

/**
 * Represents a string token.
 */
public class TokenString extends Token {

    private final String value;

    public TokenString(String value) {
        super(Type.STRING);
        this.value = value;
    }

    /**
     * Gets the value of this string token.
     *
     * @return The value
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("value", this.value)
                .toString();
    }

}
