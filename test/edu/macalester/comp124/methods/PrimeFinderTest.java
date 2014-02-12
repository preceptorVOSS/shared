package edu.macalester.comp124.methods;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * @author Shilad Sen
 */
public class PrimeFinderTest {
    @Test
    public void testIsPrime() {
        PrimeFinder finder = new PrimeFinder();
        assertTrue(finder.isPrime(2));
        assertTrue(finder.isPrime(3));
        assertTrue(finder.isPrime(7));
        assertFalse(finder.isPrime(1));
        assertFalse(finder.isPrime(0));
        assertFalse(finder.isPrime(-1));
        assertFalse(finder.isPrime(4));
    }
}
