package edu.macalester.comp124.arrays;

/**
 * @author Shilad Sen
 */
public class ArrayExamples {
    public static void main(String args[]) {
        String [] words = new String[3];
        String moreWords[] = new String[] { "Cat", "Dog", "Bird" };

        words[0] = "Hello";
        words[1] = ",";
        words[2] = " World!";

        for (String w1 : words) {
            System.out.println("word 1 is " + w1.toUpperCase());
        }

        for (int i = 0; i < words.length; i++) {
            String w1 = words[i];
            String w2 = moreWords[i];

            System.out.println("word 1 is " + w1.toUpperCase());
            System.out.println("word 2 is " + w2.toLowerCase());
        }
    }
}
