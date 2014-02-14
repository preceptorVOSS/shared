package edu.macalester.comp124.objects1;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Shape extends GCompound {
//    public Shape() {}

    public void drawHole(Color color) {
        double height = getHeight();
        double width = getWidth();
        double radius = Math.min(height, width) / 3;

        GOval hole = new GOval(radius*2, radius*2);
        hole.setFillColor(color);
        hole.setFilled(true);
        hole.setColor(Color.GRAY);
        add(hole, width/2 - radius, height/2 - radius);
    }
}
