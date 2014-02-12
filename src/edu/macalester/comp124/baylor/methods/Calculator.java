package edu.macalester.comp124.baylor.methods;

public class Calculator
{
	public int fibonacci(int a)
	{
		return -42;
	}

	public int factorialRecursive(int a)
	{
		if (a <= 1)
		{
			return 1;
		}
		System.out.println("fact("+a+") = " + a + " * " + (a-1));
		int total = a * factorialRecursive(a-1);

		return total;
	}

	public int factorial(int a)
	{
		int total=1;
		for (int i = 1; i <= a; i++)
		{
			total = total * i;
		}
		return total;
	}

	public int add(int a, int b)
	{
		int answer = a + b;

		return answer;
	}

	public int subtract(int a, int b)
	{
		return a - b;
	}

	public double divide(int a, int b)
	{
		return a / (double)b;
	}
}
