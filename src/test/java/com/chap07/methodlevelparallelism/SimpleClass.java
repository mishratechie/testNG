package com.chap07.methodlevelparallelism;

/**
 * Created by Ashutosh on 21-02-2017.
 */

import org.testng.annotations.Test;

public class SimpleClass {

    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is:"+id);
    }

    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: "+id);
    }
}

//Right click on chap07simple-class..xml and run
//To tun from maven
//http://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html