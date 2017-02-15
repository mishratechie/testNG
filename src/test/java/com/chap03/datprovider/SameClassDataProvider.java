package com.chap03.datprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 15-02-2017.
 */

/*It is mandatory for a DataProvider method to return the data in the form of double
        array of Object class (Object [][]). The first array represents a data set where as the
        second array contains the parameter values.*/

public class SameClassDataProvider {
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() { //NON-STATIC

        return new Object[][]{{"data one"}, {"data two"}};
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}