package edu.macalester.comp124.lists;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class Marker implements Comparable<Marker> {
    private final Color color;
    private final double mls;

    public Marker(Color color, double mls) {
        this.color = color;
        this.mls = mls;
    }

    public Color getColor() {
        return color;
    }

    public double getMls() {
        return mls;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "color=" + color +
                ", mls=" + mls +
                '}';
    }

    /**
     * Returns:
     * negative number if this should come before marker
     * positive number if this should come after marker
     * zero if they are "the same"
     *
     * @param you
     * @return
     */
    @Override
    public int compareTo(Marker you) {
        if (this.mls < you.mls) {
            return -1;
        } else if (this.mls > you.mls) {
            return +1;
        } else {
            return 0;
        }
    }
}
