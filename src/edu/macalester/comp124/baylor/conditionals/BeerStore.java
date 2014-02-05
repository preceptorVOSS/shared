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

	    if (worksForBatman && (iq <= 50))
	    {
		    if (name.equals("Robin"))
		    {
			    println("No, Batsies said you can't have any");
		    }
		    else
		    {
		        println("Yes, yes you may buy beer");
		    }
	    }
	    else if (iq <= 50)
	    {
		    println("Sure, those brain cells ain't goin' anywhere");
	    }
	    else
	    {
		    print("How much are you willing to pay me? ");
		    double bribeSize = readDouble();
		    if (bribeSize >= 1000000)
		    {
			    println("Here you go!");
		    }
		    else
		    {
		        println("Sorry bub, this beer's not for you");
		    }
	    }
    }
}
