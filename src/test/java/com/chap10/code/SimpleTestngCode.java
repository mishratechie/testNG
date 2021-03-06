package com.chap10.code;

/**
 * Created by Ashutosh on 23-02-2017.
 */

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleTestngCode {

    public void simpleTestNGTest() {

//List of xml suites to be considered for test execution
        List<XmlSuite> suites = new ArrayList<XmlSuite>();

//List of classes to be considered for test execution
        List<XmlClass> classes = new ArrayList<XmlClass>();

//Defines a simple xml suite with a name
        XmlSuite suite = new XmlSuite();
        suite.setName("Simple Config suite");

//Defines a xml test for a suite and with a said name
        XmlTest test = new XmlTest(suite);
        test.setName("Simple config test");

//A single xml class to be considered for execution
        XmlClass clz = new XmlClass("com.chap10.sample.SampleTest");
        classes.add(clz);

//Sets the list of classes to be considered for execution for a test
        test.setXmlClasses(classes);

//Adds a single suite to the list suites
        suites.add(suite);

//Defining a testng instance
        TestNG tng = new TestNG();

//Sets the List of xml suites to be considered for execution
        tng.setXmlSuites(suites);

//Runs the configured testng tests.
        tng.run();
    }

    public static void main(String[] args) {
        SimpleTestngCode smpCd = new SimpleTestngCode();
        smpCd.simpleTestNGTest();
    }
}




        /*
        XmlSuite Defines a simple XML suite tag of the testng XML
        XmlTest Describes a test tag of the testng XML
        XmlPackage Describes a package tag in the testng XML
        XmlClass Describes a class tag in the testng XML
        XmlGroups Describes the groups tag of the testng XML
        XmlInclude Describes an include tag of the testng XML
        XmlDefine Describes a define tag of the testng XML, which is used for defining a group of groups
        XmlDependencies Describes a dependencies tag of the testng XML, which is used for defining group dependencies*/