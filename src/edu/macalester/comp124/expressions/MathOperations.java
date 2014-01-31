package edu.macalester.comp124.expressions;

import acm.program.ConsoleProgram;

/**
 * @author Shilad Sen
 */
public class MathOperations extends ConsoleProgram {

    public void run() {
        int x = 5;
        double y = 2.3;
        double z = x % y;
        println( "z is " + z);
    }
}
