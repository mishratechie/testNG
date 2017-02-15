package com.chap03.timer;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 12-01-2017.
 */
//Direct Run
//This is method level;
//timeOut This attribute is used for a time out test and specifies the time
// (in millisecs) this method should take to execute.

public class TimeMethod {
    @Test(timeOut=500)
    public void timeTestOne() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Time test method one");
    }
    @Test
    public void timeTestTwo() throws InterruptedException{
        Thread.sleep(400);
        System.out.println("Time test method two");
    }
}