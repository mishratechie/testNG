package com.chap03.datprovider;

import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 15-02-2017.
 */
public class SeparateDataProvider {

    @Test(dataProvider = "data-provider",dataProviderClass=DataProviderClass.class)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
