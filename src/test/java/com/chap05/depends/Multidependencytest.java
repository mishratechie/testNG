package com.chap05.depends;

/**
 * Created by Ashutosh on 16-02-2017.
 */

import org.testng.annotations.Test;

public class MultiDependencyTest {

    @Test(dependsOnMethods = {"testTwo", "testThree"})
    public void testOne() {
        System.out.println("Test method one");
    }

    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }

    @Test
    public void testThree() {
        System.out.println("Test method three");
    }
}