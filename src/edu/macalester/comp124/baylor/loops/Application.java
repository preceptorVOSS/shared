package edu.macalester.comp124.baylor.loops;

import acm.program.ConsoleProgram;

import java.util.List;

public class Application
	extends ConsoleProgram
{
//    public static void main(String[] args)
//    {
//        Application app = new Application();
////        app.runPoundDemo();
////        app.runForLoopDemo();
//	    app.runKittieDemo();
//    }

	public void run()
	{
		runKittieDemo();
	}

	private void runKittieDemo()
	{
		print("What is your IQ? ");
		int iq = readInt();
		print("Monthly salary? ");
		double monthlyIncome = readDouble();

		CatHouse kittyStore = new CatHouse();
		println("We're gonna buy us some cats!");
		boolean shouldBuyMoreCats = true;
//		while (shouldBuyMoreCats)
//		{
			// get the cutest
			List<Cat> currentPurchase = kittyStore.getCutest();
			// can we afford them?
			// are we still smarter than them
//		}

		println("Here are the cats we now love to death");
		for (int i = 0; i < currentPurchase.size(); i++)
		{
			println(currentPurchase.get(i));
		}
	}

	private void runForLoopDemo()
    {
        // print #s 16 - 4 by 2s
        //  and for each print 3-9 by 3s

        // 16 3 6 9
        // 14 3 6 9
        // 12 3 6 9

        for(int i=16 ; i >= 4 ; i -= 2)
        {
            System.out.print(i + " ");
            for (int j=3; j <= 9; j+=3)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void runPoundDemo()
    {
        Pound puppyHouse = new Pound();

        Puppy aPuppy = new Puppy();
	    aPuppy.name = "Ghost";
        aPuppy.cuteness = 7;
        aPuppy.shoulderHeight = 5;
        aPuppy.sound = "Meow";
        aPuppy.weight = (0.25);
        puppyHouse.puppies.add(aPuppy);

        aPuppy = new Puppy("Greywind", 30, 5.5, 1, "neigh");
        puppyHouse.puppies.add(aPuppy);

        puppyHouse.puppies.add(new Puppy("Lady", 20, 1, 3, "woof"));

        System.out.println("Average Height:   " + puppyHouse.getMeanHeight());
        System.out.println("Average Weight:   " + puppyHouse.getMeanWeight());
        System.out.println("Average Cuteness: " + puppyHouse.getMeanCuteness());

	    System.out.println("The cutest puppy is " + puppyHouse.getCutest().name);
    }
}








