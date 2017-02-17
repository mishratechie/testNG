package com.chap05.regularex;

/**
 * Created by Ashutosh on 17-02-2017.
 */

import org.testng.annotations.Test;

public class RegularExpressionTest {

    @Test(dependsOnGroups = {"starts-with.*"})
    public void regularExpMethod() {
        System.out.println("Dependent method");
    }

    @Test(groups = {"starts-with-one"})
    public void startsWithMethodOne() {
        System.out.println("Starts with method one");
    }

    @Test(groups = {"starts-with-two"})
    public void startsWithMethodTwo() {
        System.out.println("Starts with method two");
    }
}