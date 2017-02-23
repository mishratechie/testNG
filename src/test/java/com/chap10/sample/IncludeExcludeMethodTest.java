package com.chap10.sample;

/**
 * Created by Ashutosh on 23-02-2017.
 */

import org.testng.annotations.Test;

public class IncludeExcludeMethodTest {
    @Test
    public void testMethodOne() {
        System.out.println("Test method one.");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test method two");
    }

    @Test
    public void testMethodThree() {
        System.out.println("Test method three");
    }
}
