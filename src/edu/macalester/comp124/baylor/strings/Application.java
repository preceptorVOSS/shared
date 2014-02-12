package edu.macalester.comp124.baylor.strings;

import acm.program.ConsoleProgram;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
		print("Enter a string: ");
		String someString = readLine();
		println("OK, let's do stuff to [" + someString + "]");
		println("lower case: " + someString.toLowerCase());
		println("upper case: " + someString.toUpperCase());
		println("the 3rd letter is " + someString.charAt(2));
		println("does it end with .jpg? " + someString.endsWith(".jpg"));
		someString = someString.replace(" ", "_").trim().toLowerCase().
				replace("p", "@");
		println("New string: " + someString);
		println("The first 3 characters are: " + someString.substring(0, 3));
		print("The first 6 characters still are: ");
		String shorty = "";
		for (int i=0; i <6; i++)
		{
			char someCharacter = someString.charAt(i);
			if (Character.isLetter(someCharacter))
			{
				shorty += someString.charAt(i);
			}
		}
		println(shorty);
	}
}
