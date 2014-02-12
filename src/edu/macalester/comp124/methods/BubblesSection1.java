package edu.macalester.comp124.methods;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class BubblesSection1 extends GraphicsProgram {

    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 800;
    public static final int MIN_DIAMETER = 5;
    public static final int MAX_DIAMETER = 250;

    @Override
    public void run() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        for (int i = 0; i < 100; i++) {
            makeRandomCircle();
        }
    }


    private void makeRandomCircle() {
        GPoint location = getRandomCoordinates();
        Color color = getRandomColor();
        double diameter = getRandomDiameter();
        makeCircle(diameter, location, color, false);
    }

    private void makeCircle(double diameter, GPoint location, Color color, boolean isFilled) {
        GOval circle = new GOval(diameter, diameter);
        circle.setColor(color);
        circle.setFilled(isFilled);
        circle.setFillColor(color);
        add(circle, location);
    }


    private Color getRandomColor() {
        RandomGenerator generator = new RandomGenerator();
        return generator.nextColor();
    }

    private double getRandomDiameter() {
        RandomGenerator random = new RandomGenerator();
        return random.nextDouble(MIN_DIAMETER, MAX_DIAMETER);
    }

    private GPoint getRandomCoordinates() {
        RandomGenerator random = new RandomGenerator();
        double x = random.nextDouble(0, WINDOW_WIDTH);
        double y = random.nextDouble(0, WINDOW_HEIGHT);
        return new GPoint(x, y);
    }
}
