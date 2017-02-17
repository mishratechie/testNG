package com.chap04.regularexp;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 16-02-2017.
 */
public class RegularExpGroup {

    @Test(groups = {"include-test-one"})
    public void testMethodOne() {
        System.out.println("Test method one");
    }

    @Test(groups = {"include-test-two"})
    public void testMethodTwo() {
        System.out.println("Test method two");
    }

    @Test(groups = {"test-one-exclude"})
    public void testMethodThree() {
        System.out.println("Test method three");
    }

    @Test(groups = {"test-two-exclude"})
    public void testMethodFour() {
        System.out.println("Test method Four");
    }
}