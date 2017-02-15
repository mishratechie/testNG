package com.chap03.attributes;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 04-01-2017.
 */
public class DisableTestClass {
    @Test(enabled=true)
    public void testMethodOne(){
        System.out.println("Test method one.");
    }
    @Test(enabled=false)
    public void testMethodTwo(){
        System.out.println("Test method two.");
    }
    @Test
    public void testMethodThree(){
        System.out.println("Test method three.");
    }
}
