package edu.macalester.comp124.palindrome;

import edu.macalester.comp124.methods.PrimeFinder;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * @author Shilad Sen
 */
public class PrimeFinderTest {

    @Test
    public void testIsPrime() {
        PrimeFinder pf = new PrimeFinder();
        assertTrue(pf.isPrime(7));
        assertTrue(pf.isPrime(2));
        assertFalse(pf.isPrime(1));
        assertTrue(pf.isPrime(11));
        assertFalse(pf.isPrime(4));
    }
}
