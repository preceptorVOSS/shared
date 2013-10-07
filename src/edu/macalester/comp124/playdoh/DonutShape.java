package edu.macalester.comp124.playdoh;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class DonutShape extends Shape {
    private Color holeColor = null;

    public DonutShape(Color color) {
        this(color, null);
    }

    public DonutShape(Color color, Color holeColor) {
        super(color);
        this.holeColor = holeColor;
    }

    public Color getHoleColor() {
        return holeColor;
    }

    public void setHoleColor(Color holeColor) {
        this.holeColor = holeColor;
    }

    @Override
    public String toString() {
        return "DonutShape{" +
                "color=" + getColor() +
                " holeColor=" + holeColor +
                '}';
    }
}
