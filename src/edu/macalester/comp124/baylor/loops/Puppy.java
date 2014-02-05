package edu.macalester.comp124.baylor.loops;

public class Puppy
{
	String name;
    int shoulderHeight; // height at shoulder in cm
    String sound;
    int cuteness;   // 1-7
    double weight; // stones

    public Puppy() {}
    public Puppy(String name, int height, double weight, int cuteness, String sound)
    {
        this.shoulderHeight = height;
        this.weight = weight;
        this.cuteness = cuteness;
        this.sound = sound;
    }
}
