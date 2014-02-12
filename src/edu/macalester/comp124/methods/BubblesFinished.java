package edu.macalester.comp124.methods;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class BubblesFinished extends GraphicsProgram {
    private RandomGenerator generator = new RandomGenerator();


    public void run() {
        setSize(1200, 800);
        for (int i = 0; i < 10; i++) {
            drawCluster(
                    generator.nextDouble(0, getWidth()),
                    generator.nextDouble(0, getHeight()));
        }
    }

    private void drawCluster(double x, double y) {
        GOval center = new GOval(20, 20);
        center.setFilled(true);
        center.setFillColor(Color.RED);
        add(center, x, y);

        for (int i = 0; i < 25; i++) {
            double xc = x + generator.nextDouble(-150, 150);
            double yc = y + generator.nextDouble(-150, 150);
            drawRandomCircleAt(xc, yc);
        }
    }

    private void drawRandomCircleAt(double x, double y) {
        double diameter = generator.nextDouble(5, 100);
        GOval oval = new GOval(diameter, diameter);
        oval.setColor(pickRandomColor());
        add(oval, x, y);
    }

    private Color pickRandomColor() {
        return generator.nextColor();
    }
}
