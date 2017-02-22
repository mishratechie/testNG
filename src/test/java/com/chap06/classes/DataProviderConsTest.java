package com.chap06.classes;

/**
 * Created by Ashutosh on 20-02-2017.
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderConsTest {

    private int param;

    @Factory(dataProvider = "dataMethod")
    public DataProviderConsTest(int param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][]{
                {0},
                {1}
        };
    }

    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }

    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}

