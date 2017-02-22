package com.chap06.factory;

/**
 * Created by Ashutosh on 20-02-2017.
 */

import com.chap06.classes.SimpleTest;
import org.testng.annotations.Factory;


public class SimpleTestFactory {


    @Factory
    public Object[] factoryMethod() {

        return new Object[]{
                new SimpleTest(),
                new SimpleTest()
        };
    }
/*
    One of the main advantages of using the factory methods is that you can pass parameters
    to test classes while initializing them. These parameters can then be used across all the test
    methods present in the said classes.*/
}