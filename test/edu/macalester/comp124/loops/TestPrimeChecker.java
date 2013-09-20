package edu.macalester.comp124.loops;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class TestPrimeChecker {

    @Test
    public void testIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertEquals(false, checker.isPrime(0));
        assertEquals(true, checker.isPrime(2));;
        assertEquals(true, checker.isPrime(3));
        assertEquals(false, checker.isPrime(1));
        assertEquals(true, checker.isPrime(47));
    }
}
