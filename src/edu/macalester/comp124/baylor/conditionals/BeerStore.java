package edu.macalester.comp124.baylor.conditionals;

import acm.program.ConsoleProgram;

/**
 * Check a variety of facts to determine whether someone can buy beer.
 * Uses the ACM's Java library to make it a little easier to get user input.
 */
public class BeerStore extends ConsoleProgram
{
	public void run()
	{
	   conditionalDemo();
	}

    public void getTotalDemo()
    {
        println("Enter a bunch of numbers");
        int total = 0;
        while (true)
        {
            int value = readInt();
            if (-1 == value)
            {
                break;
            }
            total = total + value;
        }
        println("Your total is " + total);
    }

    public void conditionalDemo()
    {
        print("How old are you? ");
        int age = readInt();
	    print("What's your IQ? ");
        int iq  = readInt();
	    print("What's your name? ");
        String name = readLine();
	    print("Current blood alcohol content? ");
        double bac = readDouble();
	    print("Do you work for Batman? (true/false) ");
        boolean worksForBatman = readBoolean();

        if (age >= 18 && !(bac < 0.02))
        {
            println("You can buy this beer");
        }
        else if (age >= 18 || bac < 0.02)
        {
            println("You are so close but no, you may not have this");
        }
        else if (age < 18 && bac >= 0.02)
        {
            println("You are a total waster, i'm calling the cops");
        }
        else if (age < 18)
        {
            println("Go away, you are a baby");
        }
        else
        {
            println("Go home student, you are drunk");
        }
    }
}
