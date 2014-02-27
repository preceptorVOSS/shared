package edu.macalester.comp124.baylor.inheritance;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by baylor on 2/26/14.
 */
public class Application
	extends ConsoleProgram
{
	public void run()
	{
		//--- Old MacDonald had a farm...
		List<Animal> farm = new ArrayList<Animal>();
		Animal a = new Lion();
		farm.add(a);
		a = new Kitten();
		farm.add(a);
        a = new Cow();
        farm.add(a);
        a = new Horse();
        farm.add(a);
        a = new Chicken();
        farm.add(a);
        a = new Pig();
        farm.add(a);

		//--- We're going to play this game until the user tells us to quit
		boolean wantToPlay = true;

		//--- Pick an animal at random
		Random dice = new Random();
        int randAnimal;
        int guess;
        int response;
        String result;
        Animal mysteryAnimal;
		//--- If you don't remember how to do random numbers,
		//---   Google is your friend. Also, your text book.
        while(wantToPlay) {
            guess = 3;
            randAnimal = dice.nextInt(6);
            randAnimal--;
            mysteryAnimal = farm.get(randAnimal);
            println("I'll give you three guesses as to what this animal is. \n");
            while(guess >= 1) {
                println("What do you do? \n");
                println("1. Pet \n" +
                        "2. Ride \n" +
                        "3. Feed Meat \n" +
                        "4. Stare \n" +
                        "Choice: ");
                response = readInt();
                switch (response) {
                    case 1:
                        result = mysteryAnimal.pet();
                        break;
                    case 2:
                        result = mysteryAnimal.ride();
                        break;
                    case 3:
                        result = mysteryAnimal.giveMeat();
                        break;
                    case 4:
                        result = mysteryAnimal.stare();
                        break;
                    default:
                        println("Not a possible option. \n");
                        result = "does not have a hint for you";
                        break;
                }
                println("The animal " + result + "\n");
                println("What do you think it is? \n" +
                        "1. Lion \n" +
                        "2. Kitten \n" +
                        "3. Cow \n" +
                        "4. Horse \n" +
                        "5. Chicken \n" +
                        "6. Pig \n" +
                        "Choice: ");
                response = readInt();
                response--;
                if (response == randAnimal) {
                    println("Correct!");
                    guess = 0;
                }else {
                    println("Nope!");
                    guess--;
                }
            }
            println("Play again? (true or false)");
            wantToPlay = readBoolean();
        }
	}
}
