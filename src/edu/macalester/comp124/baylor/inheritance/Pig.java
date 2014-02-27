package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
public class Pig
    extends OtherFarmAnimal {

    public Pig() {
        super("Pig");
    }

    @Override
    public String giveMeat() {
        return "eats the meat";
    }

    @Override
    public String ride() {
        return "squeals and runs away";
    }
}
