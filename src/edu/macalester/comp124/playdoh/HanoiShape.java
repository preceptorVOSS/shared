package edu.macalester.comp124.playdoh;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class HanoiShape extends Shape {
    private int height = 80;
    private int width = 80;

    public HanoiShape() {
        this(Color.MAGENTA);
    }

    public HanoiShape(Color color) {
        this(color, 80, 80);
    }

    public HanoiShape(Color color, int height, int width) {
        super(color);
        setColor(color);
        this.height = height;
        this.width = width;
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
