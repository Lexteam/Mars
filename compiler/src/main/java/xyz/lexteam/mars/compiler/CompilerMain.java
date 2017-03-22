package xyz.lexteam.mars.compiler;

import xyz.lexteam.mars.compiler.lexer.Lexer;

/**
 * The main class for the Mars compiler.
 */
public final class CompilerMain {

    public static void main(String[] args) {
        System.out.println(Lexer.lex("package uk.jamierocks.example\n"
                + "\n"
                + "class Example {\n"
                + "\n"
                + "    private string name = \"jamierocks\"\n"
                + "    \n"
                + "    void printName() {\n"
                + "        print(this.name)\n"
                + "    }\n"
                + "\n"
                + "}\n"
                + "\n"
                + "void main(string[] args) {\n"
                + "    new Example().printName()\n"
                + "}"));
    }

}
