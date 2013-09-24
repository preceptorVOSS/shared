package edu.macalester.comp124.playdoh;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class HanoiShape {
    private Color color = Color.MAGENTA;
    private int height = 80;
    private int width = 80;

    public HanoiShape() {
    }

    public HanoiShape(Color color) {
        this.color = color;
    }

    public HanoiShape(Color color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
