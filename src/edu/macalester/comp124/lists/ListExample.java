package edu.macalester.comp124.lists;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Instructions:
 *
 * set LIST_SIZE
 *
 * @author Shilad Sen
 */
public class ListExample extends ConsoleProgram {
    private int LIST_SIZE = 1000000;

    public void run() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add("I am " + i);
        }
        long numChars = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            String s = list.get(0);
            numChars += s.length();
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        double mean = 1.0 * (end - start) / LIST_SIZE;
        println("numChars is " + numChars);
        println("mean time is " + mean + " millis");
    }
}















