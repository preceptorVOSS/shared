package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
public class Cow
    extends FarmMammal {

    public Cow() {
        super("Cow");
    }

    @Override
    public String pet() {
        return "does nothing";
    }
    @Override
    public String stare() {
        return "does nothing";
    }
}
