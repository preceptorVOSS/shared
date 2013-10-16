package edu.macalester.comp124.hello;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Mailbox extends GraphicsProgram {
    public void run() {
        GRect box = new GRect(10, 50, 100, 35);
        GRect flag = new GRect(10, 50);
        GRect stand = new GRect(10, 100);
        GRect grass = new GRect(100,10);
        box.setFilled(true);
        box.setColor(Color.BLUE);
        flag.setFilled(true);
        flag.setColor(Color.RED);
        grass.setFilled(true);
        grass.setColor(Color.GREEN);
        add(box);
        add(flag, 70, 10);
        add(stand, 55, 85);
        add(grass, 20, 180);
    }

}
