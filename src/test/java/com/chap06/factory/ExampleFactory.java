package com.chap06.factory;

/**
 * Created by Ashutosh on 21-02-2017.
 */

import com.chap06.classes.ExampleTest;
import org.testng.annotations.Factory;


public class ExampleFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new ExampleTest("one"),
                new ExampleTest("two")
        };
    }
}

//Before class will be executed twice with factory , but with data provider only once