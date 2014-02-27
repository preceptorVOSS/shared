package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
public class Chicken
    extends OtherFarmAnimal {

    public Chicken() {
        super("Chicken");
    }

    @Override
    public String giveMeat() {
        return "pecks at the meat";
    }

    @Override
    public String ride() {
        return "flies into the sky with you";
    }
}
