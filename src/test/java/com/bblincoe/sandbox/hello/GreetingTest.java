package com.bblincoe.sandbox.hello;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Brandon on 7/28/2016.
 */
public class GreetingTest extends TestCase {

    @Test
    public void testConstruction() {
        try {
            new Greeting();
            new Greeting(1, "");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIllegalConstruction() {
        try {
            new Greeting(-1, "");
            fail("id should not be negative");
        } catch (Exception e) {
            // Ignore - An exception should be thrown
        }
    }

}