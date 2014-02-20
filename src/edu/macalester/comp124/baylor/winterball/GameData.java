package edu.macalester.comp124.baylor.winterball;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Game data takes up a lot of room and that makes the main Game
 * class messy so we've moved all the data stuff here.
 */
public class GameData
{
//	public List<???> getActions()
//	{
//
//	}

	public String getEndingText(String endingID)
	{
		if (endingID.equals("noDate"))
		{
			return "Finally the day of the Winter Ball is here. " +
					"Unfortunately, no matter how hard you tried (or didn't try), you just couldn't " +
					"find that certain special someone who had the qualities you were looking for, " +
					"which is a nice way of saying that nobody liked you enough to ask you out.";
		}

		return "Sorry, you got an ending that doesn't exist.";
	}

//	public List<Person> getLoveInterests()
//	{
//		List<Person> people = new LinkedList<>();
//		Person aPerson;
//
//		aPerson = new Person();
//		aPerson.name = "Darkness";
//		people.add(aPerson);
//
//		return people;
//	}

}
