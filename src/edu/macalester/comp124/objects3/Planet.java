package edu.macalester.comp124.objects3;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Planet extends CelestialBody {
    public Planet(Color color, int radius) {
        GOval circle = new GOval(radius*2, radius*2);
        circle.setFilled(true);
        circle.setFillColor(color);
        add(circle);
    }

}
