package edu.macalester.comp124.loops;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * @author Shilad Sen
 */
public class RingsUntilSentinel extends GraphicsProgram {

    @Override
    public void run() {
        int width = getWidth();
        int height = getHeight();

        int radius = 200;
        while (true) {
            String response = readLine("Enter 'stop' to stop: ");
            if (response.equals("stop")) {
                break;
            }
            radius /= 2;
            int x = width / 2 - radius;
            int y = height / 2 - radius;
            this.add(new GOval(radius * 2, radius * 2), x, y);
        }
        println("FINISHED!");
    }
}
















