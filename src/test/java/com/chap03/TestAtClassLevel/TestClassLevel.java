package com.chap03.testatclasslevel;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 22-12-2016.
 */

//Here declaring the @Test at class level ,all the public methods of a class will be considered as a test method

@Test
public class TestClassLevel {

    public void myTest1(){
        System.out.println("Hello Test 1");
    }

    public void myTest2(){
        System.out.println("Hello Test 2");
    }
}
