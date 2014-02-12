package edu.macalester.comp124.baylor.loops;

import java.util.LinkedList;
import java.util.List;

public class CatHouse
{
	public List<Cat> residents = new LinkedList<Cat>();
	private Object cutest;

	public CatHouse()
	{
		residents.add(new Cat("Arya", "gray", 50, 12, 5, 10));
		residents.add(new Cat("Bob", "black", 25, 6, 15, 10));
		residents.add(new Cat("Carol", "black", 50, 12, 5, 8));
		residents.add(new Cat("Dave", "black", 75, 20, 5, 10));
		residents.add(new Cat("Elena", "black", 30, 19, 35, 10));
		residents.add(new Cat("Fred", "orange", 45, 16, 8, 10));
		residents.add(new Cat("Grace", "white", 100, 6, 1, 3));
		residents.add(new Cat("Grace2", "white", 100, 6, 1, 3));
		residents.add(new Cat("Grace3", "white", 100, 6, 1, 3));
		residents.add(new Cat("Grace4", "white", 100, 6, 1, 3));
		residents.add(new Cat("Harry", "white", 50, 12, 5, 12));
		residents.add(new Cat("Ingrid", "white", 25, 6, 15, 10));
		residents.add(new Cat("Jaquin", "yellow", 75, 20, 5, 20));
	}

	public List<Cat> getCutest()
	{
		List<Cat> theBest = new LinkedList<Cat>();
		double highScore = Integer.MIN_VALUE;
		for (int i=0; i < residents.size(); i++)
		{
			Cat current = residents.get(i);
			if (getCutenessScore(current) > highScore)
			{
				theBest.clear();
				theBest.add(current);
				highScore = getCutenessScore(current);
			}
			else if (getCutenessScore(current) == highScore)
			{
				theBest.add(current);
			}
		}
		return theBest;
	}

	private double getCutenessScore(Cat aCat)
	{
		if (null == aCat)
		{
			return Integer.MIN_VALUE;
		}

		//--- Fat cats are cute
		double cuteness = (aCat.weight / (double)aCat.length);
		//--- Young cats are cute
		cuteness -= aCat.age;
		//--- Orange cats are cute
		if ("orange".equalsIgnoreCase(aCat.color))
		{
			cuteness += 10;
		}
		return cuteness;
	}
}
