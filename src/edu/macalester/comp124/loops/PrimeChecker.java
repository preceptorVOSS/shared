package edu.macalester.comp124.loops;

/**
 * @author Shilad Sen
 */
public class PrimeChecker {
    /**
     * Determines whether a number is prime.
     * @param n The number to check
     * @return True iff the number is prime.
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
