package com.chap05.depends;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 16-02-2017.
 */

public class SimpleDependencyTest {

    @Test(dependsOnMethods = {"testTwo"})
    public void testOne() {
        System.out.println("Test method one");
    }

    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }
}


   /*

   org.testng.TestNGException:
        The following methods have cyclic dependencies:


   @Test(dependsOnMethods = {"testTwo"})
    public void testOne() {
        System.out.println("Test method one");
    }

    @Test(dependsOnMethods = {"testOne"})
    public void testTwo() {
        System.out.println("Test method two");
    }
*/