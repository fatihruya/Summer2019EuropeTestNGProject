package com.cybertek.tests.day7_testng;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals(1,1);

        System.out.println("Second Assertion");
        Assert.assertEquals("title", "titlE");

        System.out.println("after second assertion");

    }

    @Test
    public void test2(){

      //verify that title starts with C
        String actualTitle = "Cybertek";
        String expectedTitleBeginning = "C";

        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning), "verify title starts with C");


        //TASK
        //verify that email includes @ sign
        Assert.assertTrue("any@mail".contains("@"), "verify @");
    }

    @Test
    public void test3(){

        Assert.assertNotEquals("one", "two", "one shouldn't be equal to two");

    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }

}
