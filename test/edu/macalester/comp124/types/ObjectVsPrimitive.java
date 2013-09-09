package edu.macalester.comp124.types;

import org.junit.Test;

import org.junit.Assert;

/**
 * @author Shilad Sen
 */
public class ObjectVsPrimitive {

    @Test
    public void testPrimitives() {
        String s = "Hello, World";
        Assert.assertEquals(s.length(), 12);
        Assert.assertEquals(s.toString(), "Hello, World");

        Double x = 3.4;
        Assert.assertEquals(x.toString(), "3.4");
    }
}
