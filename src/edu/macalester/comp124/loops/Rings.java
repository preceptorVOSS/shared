package edu.macalester.comp124.loops;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * @author Shilad Sen
 */
public class Rings extends GraphicsProgram {

    public static final int NUM_RINGS = 10;

    @Override
    public void run() {
        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i < NUM_RINGS; i++) {
            int radius = i * 10;
            int x = width / 2 - radius;
            int y = height / 2 - radius;
            this.add(new GOval(radius * 2, radius * 2), x, y);
        }
    }
}
