package edu.macalester.comp124.baylor.loops;

import acm.program.ConsoleProgram;

public class WorldsMostBoringGame
		extends ConsoleProgram
{
	public void run()
	{
		println("Welcome to You Are A Stud RPG");
		boolean iWon = true;
		while (iWon)
		{
			print("Did you win? ");
			iWon = readBoolean();
			if (iWon)
			{
				println("Yes, yes you did");
				println("i'm busting out of this joint");
//				break;
			}
			else
			{
				println("Are you sure? Let's try again");
			}
		}
	}
}
