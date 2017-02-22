package com.chap09.sample;

/**
 * Created by Ashutosh on 22-02-2017.
 */

import org.testng.Assert;

import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testMethodOne() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"testMethodTwo"})
    public void testMethodThree() {
        Assert.assertTrue(true);
    }
}