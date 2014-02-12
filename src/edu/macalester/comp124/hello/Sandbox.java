package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * @author Shilad Sen
 */
public class Sandbox extends ConsoleProgram {
    public void run() {
        String s1 = String.valueOf(4.0);
        println("s1 is " + s1);
        String s2 = String.valueOf(4.0f);
        println("s1 is " + s2);
        String s3 = "4.0";
        String s4 = "" + 4.0;
        int i = readInt();
        int j = readInt("Please type a number: ");
    }
}
