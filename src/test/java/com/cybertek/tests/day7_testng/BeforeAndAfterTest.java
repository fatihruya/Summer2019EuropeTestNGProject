package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is my Test");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("This is my test2");
    }

    @Test
    public void test3(){
        System.out.println("this is my test3");
    }

    @BeforeMethod
    public void SetUpMethod(){

        System.out.println("BEFORE THE METHOD");
        System.out.println("OPENING THE BROWSER");


    }
    @AfterMethod
    public void tearDown(){

        System.out.println("CLOSE THE BROWSER");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS CODE");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
