package edu.macalester.comp124.loops;

import acm.program.ConsoleProgram;

/**
 * @author Shilad Sen
 */
public class FIndMax extends ConsoleProgram {
    @Override
    public void run() {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < 7; i++) {
            int n = readInt();
            if (n > max) {
                max = n;
                maxIndex = i;
            }
        }
        println("max is " + max + " maxIndex is " + maxIndex);
    }
}
