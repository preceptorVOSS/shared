package edu.macalester.comp124.loops;

import acm.program.ConsoleProgram;

/**
 * A program that repeatedly:
 * - asks the user for a number and then
 * - counts the number of primes that are less than or equal to that number
 *
 * Your task is to implement countPrimesUpTo.
 * You should create at least one helper function.
 */
public class PrimeFinder extends ConsoleProgram {

	public void run() {
		while (true) {
			int n = readInt("Enter the max range to search for primes (or -1 to stop)");
			if (n == -1) {
				break;
			}
			long before = System.currentTimeMillis();
			int numPrimes = countPrimesUpTo(n);
			long after = System.currentTimeMillis();
            println("Found " + numPrimes + " primes in " + (after-before) + " milliseconds");
		}
	}
	
	/* TODO: Implement the countPrimesUpTo method, along with at least one other helper method.
	 * @param maxNum The maximum number that should be considered as a prime.
	 */
	public int countPrimesUpTo(int maxNum) {
        PrimeChecker checker = new PrimeChecker();
        int numPrimes = 0;
        for (int i = 0; i <= maxNum; i++) {
            if (checker.isPrime(i)) {
                numPrimes++;
            }
        }
        return numPrimes;
	}
}





























