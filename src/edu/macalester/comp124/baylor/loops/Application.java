package edu.macalester.comp124.baylor.loops;

public class Application
{
    public static void main(String[] args)
    {
        Application app = new Application();
//        app.runPoundDemo();
//        app.runForLoopDemo();
	    app.runKittieDemo();
    }

	private void runKittieDemo()
	{

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








