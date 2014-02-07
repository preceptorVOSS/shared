package edu.macalester.comp124.baylor.loops;

public class Cat
{
	String name, color;
	int    weight=30, length, age=5;
	int    iq;

	public Cat(String name, String color, int weight, int length,
	           int age, int iq)
	{
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.length = length;
		this.age = age;
		this.iq = iq;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
