package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
public class Horse
    extends FarmMammal {

    public Horse() {
        super("Horse");
    }

    @Override
    public String pet() {
        return "says 'naaayyy'";
    }

    @Override
    public String stare() {
        return "kicks!";
    }
}
