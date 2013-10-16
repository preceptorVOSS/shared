package edu.macalester.comp124.events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Shilad Sen
 */
public class MouseLocationPrinter implements MouseListener {
    private final String name;

    public MouseLocationPrinter(String name) {
        this.name = name;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.err.println(name + "mouse clicked at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.err.println(name + "mouse pressed at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.err.println(name + "mouse released at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.err.println(name + "mouse entered at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.err.println(name + "mouse exited at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }
}
