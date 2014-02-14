package edu.macalester.comp124.objects1;

import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Star extends Shape {
    public Star(Color color, int radius) {
        GRect square = new GRect(radius * 2, radius * 2);
        square.setFilled(true);
        square.setFillColor(color);
        add(square);
    }
}
