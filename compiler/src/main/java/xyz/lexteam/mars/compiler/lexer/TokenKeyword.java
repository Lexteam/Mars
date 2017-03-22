package xyz.lexteam.mars.compiler.lexer;

import xyz.lexteam.mars.compiler.Keyword;

/**
 * Represents a token of which is a keyword.
 */
public class TokenKeyword extends Token {

    private final Keyword keyword;

    public TokenKeyword(Keyword keyword) {
        super(Type.KEYWORD);
        this.keyword = keyword;
    }

    public Keyword getKeyword() {
        return this.keyword;
    }

    @Override
    public String toString() {
        return "TokenKeyword(keyword: " + keyword.name() + ")";
    }
}
