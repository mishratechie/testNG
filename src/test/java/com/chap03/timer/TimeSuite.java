package com.chap03.timer;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 12-01-2017.
 */
public class TimeSuite {

    //This will fail as we mentioned timeout in xml. : <suite name="Time test Suite" time-out="500" verbose="1" >
    @Test
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
