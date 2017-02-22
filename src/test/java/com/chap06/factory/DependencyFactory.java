package com.chap06.factory;

/**
 * Created by Ashutosh on 21-02-2017.
 */

import com.chap06.classes.DependencyTest;
import org.testng.annotations.Factory;

public class DependencyFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new DependencyTest(1),
                new DependencyTest(2)
        };
    }
}