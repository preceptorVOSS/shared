package edu.macalester.comp124.baylor.inheritance;

abstract public class Animal
{
	public String species;

	public Animal(String species)
	{
		this.species = species;
	}

	abstract public String pet();
	abstract public String giveMeat();
}
