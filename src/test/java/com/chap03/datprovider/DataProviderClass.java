package com.chap03.datprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by Ashutosh on 15-02-2017.
 */
public class DataProviderClass {

    @DataProvider(name="data-provider")
    public static Object[][] dataProviderMethod(){ //STATIC
        return new Object[][] { { "data one" }, { "data two" } };
    }

}
