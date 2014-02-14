package edu.macalester.comp124.objects3;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Star extends CelestialBody {
    public Star(Color color, int radius) {
        GRect rect = new GRect(radius*2, radius*2);
        rect.setFillColor(color);
        rect.setFilled(true);
        add(rect);
    }
}
