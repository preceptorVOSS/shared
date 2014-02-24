package edu.macalester.comp124.section1.phones;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Phone {
    private int[] number;
    private Color color;

    public Phone(int[] number, Color color) {
        this.number = number;
        this.color = color;
    }

    public Phone(int[] number) {
        this(number, Color.BLACK);
    }

    public int[] getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public void sendText(int number[], String message) {
        throw new UnsupportedOperationException("This phone doesn't support text messages");
    }
}
