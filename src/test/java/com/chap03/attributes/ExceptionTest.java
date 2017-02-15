package com.chap03.attributes;

/**
 * Created by Ashutosh on 04-01-2017.
 */

import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions = {IOException.class})
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }

    @Test(expectedExceptions = {IOException.class,
            NullPointerException.class})
    public void exceptionTestTwo() throws Exception {
        throw new Exception();
    }
}