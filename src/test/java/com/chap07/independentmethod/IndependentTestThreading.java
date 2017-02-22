package com.chap07.independentmethod;

/**
 * Created by Ashutosh on 22-02-2017.
 */

import org.testng.annotations.Test;

public class IndependentTestThreading {

    @Test(threadPoolSize = 3, invocationCount = 3, timeOut = 1000)
    public void testMethod() {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }
}
//Can be run directly or through xml