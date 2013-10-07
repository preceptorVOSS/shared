package edu.macalester.comp124.playdoh;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}
