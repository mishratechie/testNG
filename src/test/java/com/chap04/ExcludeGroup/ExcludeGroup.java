package com.chap04.excludeGroup;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 16-02-2017.
 */
public class ExcludeGroup {

    @Test(groups = {"include-group"})
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }

    @Test(groups = {"include-group"})
    public void testMethodTwo() {


        System.out.println("Test method two belonging to a group.");
    }

    @Test(groups = {"include-group", "exclude-group"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to two groups.");
    }
    /*If a test method belongs
    to both included and excluded group, the excluded group takes the priority and the test
    method will be excluded from the test execution.*/
}