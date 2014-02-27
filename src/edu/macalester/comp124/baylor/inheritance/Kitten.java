package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by dvoss on 2/27/14.
 */
public class Kitten
    extends Feline{

    public Kitten(){
        super("Kitten");
    }

    @Override
    public String giveMeat() {
        return "nibbles";
    }

    @Override
    public String ride() {
        return "scratches and runs away";
    }
}
