package edu.macalester.comp124.lists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shilad Sen
 */
public class Sorting {
    public Sorting() {}

    public void markerExample() {
        List<Marker> markers = new ArrayList<Marker>();
        markers.add(new Marker(Color.PINK, 35));
        markers.add(new Marker(Color.BLUE, 20));
        markers.add(new Marker(Color.BLACK, 10));
        Collections.sort(markers);
        for (Marker marker : markers) {
            System.out.println("value is " + marker);
        }
    }

    public void example() {
        List<String> list = new ArrayList<String>();
        list.add("" + 9);
        list.add("" + 4);
        list.add("" + 1);
        list.add("" + 11);
        Collections.sort(list);
        Collections.reverse(list);
        for (String i : list) {
            System.out.println("value is " + i);
        }
    }

    public static void main(String args[]) {
        Sorting s = new Sorting();
        s.markerExample();
    }
}
