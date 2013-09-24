package edu.macalester.comp124.playdoh;

import acm.program.ConsoleProgram;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class PlaydohPlay extends ConsoleProgram {
    public void run() {
        HanoiShape notYellowHanoi = new HanoiShape();
        println("color is now " + notYellowHanoi.getColor());
        notYellowHanoi.setColor(Color.PINK);
        println("color is now " + notYellowHanoi.getColor());

        HanoiShape tinyHanoi = new HanoiShape(Color.RED, 3, 5);

        Color color = new Color(139, 69, 19);
        DonutShape chocolateDonut = new DonutShape(color);
        println("i like my donuts: " + chocolateDonut.getColor());
    }
}
