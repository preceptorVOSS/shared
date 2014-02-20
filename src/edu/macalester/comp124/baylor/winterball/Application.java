package edu.macalester.comp124.baylor.winterball;

import acm.program.ConsoleProgram;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
		println("  *********************************");
		println("  ***  Road to the Winter Ball  ***");
		println("  *********************************");
		println();

		Game game = new Game();
		while (!game.isOver())
		{
			println("Day " + game.getDay());
			println("What do you want to do?");

			List<String> actions = game.getActions();

			List<Person> boys = game.getLoveInterests();

			println();
		}
		String ending = game.getEnding();
		println(game.getEndingText(ending));
	}
}
