package xyz.lexteam.mars.compiler;

/**
 * Represents keywords.
 */
public enum Keyword {

    PACKAGE,
    PUBLIC,
    PRIVATE,
    CLASS,
    INTERFACE,
    ENUM,
    STRUCT,
    NEW,
    STRING,
    BOOL,
    INT,
    DOUBLE,
    SHORT,
    FLOAT,
    VOID,
    ;

    public static boolean isKeyword(String token) {
        for (Keyword keyword : values()) {
            if (keyword.getToken().equals(token)) {
                return true;
            }
        }
        return false;
    }

    public static Keyword getKeyword(String token) {
        for (Keyword keyword : values()) {
            if (keyword.getToken().equals(token)) {
                return keyword;
            }
        }
        return null;
    }

    public String getToken() {
        return this.name().toLowerCase();
    }

}
