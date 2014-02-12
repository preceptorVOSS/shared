package edu.macalester.comp124.baylor.recursion;

import acm.program.ConsoleProgram;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
		while (true)
		{
			print("Enter a number (-1 to quit): ");
			int number = readInt();
			if (number < 0)
			{
				break;
			}
			int answer = Fibonnaci.getNumber(number);
			println("The Fibonacci is " + answer);
		}
	}
}
