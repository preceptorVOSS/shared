package edu.macalester.comp124.methods;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class BubblesSection3 extends GraphicsProgram {
    public void run() {
        setSize(1024, 768);
        for (int i = 0; i < 100; i++) {
            makeRandomCircle();
        }
    }


    private Color getRandomColor() {
        RandomGenerator generator = new RandomGenerator();
        return generator.nextColor();
    }

    private GPoint getRandomLocation() {
        RandomGenerator generator = new RandomGenerator();
        double x = generator.nextDouble(0, getWidth());
        double y = generator.nextDouble(0, getHeight());
        return new GPoint(x, y);
    }

    private int getRandomDiameter() {
        RandomGenerator generator = new RandomGenerator();
        return generator.nextInt(0, getWidth() / 3);
    }

    private void makeRandomCircle() {
        GPoint location = getRandomLocation();
        Color color = getRandomColor();
        int diameter = getRandomDiameter();
        makeCircle(diameter, location, color, false);
    }

    private void makeCircle(int diameter, GPoint location, Color color, boolean isFilled) {
        GOval circle = new GOval(diameter, diameter);
        circle.setColor(color);
        circle.setFilled(isFilled);
        circle.setFillColor(color);
        add(circle, location);
    }

}











