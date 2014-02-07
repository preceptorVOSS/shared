package edu.macalester.comp124.loops;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * @author Shilad Sen
 */
public class Rings extends GraphicsProgram {
    public void run() {
        add(new GOval(200, 200));
        GOval secondOval = new GOval(100, 100);
        add(secondOval, 50, 50);
        add(new GOval(75, 75, 50, 50));
    }
}
