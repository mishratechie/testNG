package com.chap09.reporter;

/**
 * Created by Ashutosh on 22-02-2017.
 */

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites,
                               List<ISuite> suites,
                               String outputDirectory) {

//Iterating over each suite included in the test
        for (ISuite suite : suites) {

//Following code gets the suite name
            String suiteName = suite.getName();

//Getting the results for the said suite
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();

                System.out.println("Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '"+ suiteName + "' is:" + tc.getSkippedTests().getAllResults().size());
            }
        }
    }
}

//Use report ng for better html outputs