package com.bblincoe.sandbox.hello;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

/**
 * Created by Brandon on 7/28/2016.
 */
public class GreetingControllerTest extends TestCase {

    @Test
    public void testConstruction() {
        try {
            new GreetingController();

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testIllegalConstruction() {

    }

}