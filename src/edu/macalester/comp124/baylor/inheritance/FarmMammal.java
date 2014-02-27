package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
abstract public class FarmMammal
    extends Animal {

    public FarmMammal(String species) {
        super(species);
    }

    @Override
    public String giveMeat() {
        return "ignores the meat";
    }
    @Override
    public String ride() {
        return "has been ridden";
    }
}
