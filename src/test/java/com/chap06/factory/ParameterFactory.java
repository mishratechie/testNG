package com.chap06.factory;

/**
 * Created by Ashutosh on 20-02-2017.
 */

import com.chap06.classes.ParameterTest;
import org.testng.annotations.Factory;

public class ParameterFactory {


    @Factory
    public Object[] paramFactory() {
        return new Object[]{

                new ParameterTest(0),
                new ParameterTest(1)
        };
    }
}