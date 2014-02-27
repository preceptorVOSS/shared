package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
abstract public class OtherFarmAnimal
    extends Animal {

    public OtherFarmAnimal(String species) {
        super(species);
    }

    public String stare() {
        return "stares back";
    }

    public String pet() {
        return "ignores you";
    }
}
