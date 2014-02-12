package edu.macalester.comp124.baylor.recursion;

public class Fibonnaci
{
	/**
	 * Fibonacci of n is the sum of Fibonnaci n-1 + n-2
	 * @param n The Fibonnaci we want
	 * @return the nth Fibonacci
	 */
	static public int getNumber(int n)
	{
		//--- The first two numbers are special cases
		if (n == 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}

		return getNumber(n-1) + getNumber(n-2);
	}
}
