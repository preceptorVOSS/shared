package edu.macalester.comp124.loops;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class TestPrimeFinder {
    @Test
    public void testPrimeFinder() {
        PrimeFinder pf = new PrimeFinder();
        assertEquals(0, pf.countPrimesUpTo(1));
        assertEquals(1, pf.countPrimesUpTo(2));
        assertEquals(2, pf.countPrimesUpTo(3));
        assertEquals(2, pf.countPrimesUpTo(4));
        assertEquals(3, pf.countPrimesUpTo(5));
    }
}
