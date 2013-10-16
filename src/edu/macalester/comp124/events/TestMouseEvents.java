package edu.macalester.comp124.events;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 * @author Shilad Sen
 */
public class TestMouseEvents extends GraphicsProgram implements MouseListener {
    @Override
    public void run() {
        add(new GOval(30, 30));

        addMouseListeners(new MouseLocationPrinter("shilad "));
        addMouseListeners(new MouseLocationPrinter("rebecca "));

        addMouseListeners();
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.err.println("TESTMOUSEEVENTS mouse pressed at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

}
