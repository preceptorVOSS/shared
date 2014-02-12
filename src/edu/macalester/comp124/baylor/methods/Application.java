package edu.macalester.comp124.baylor.methods;

import acm.program.ConsoleProgram;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
		Calculator myTI84 = new Calculator();
		println("2 + 2 = " + myTI84.add(2, 2));
		println("8 - 3 = " + myTI84.subtract(8,3));
		println("99 / 100 = " + myTI84.divide(99,100));
		println("5! = " + myTI84.factorial(5));
		println("5! recursively = " + myTI84.factorialRecursive(5));
//		println("fib(6) = " + myTI84.fibonacci(6));
	}
}
