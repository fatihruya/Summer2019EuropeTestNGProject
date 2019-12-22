package com.cybertek.tests.herokuapp;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase2 {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.quit();
    }
  //  Step 1. Go to “https://practice-cybertekschool.herokuapp.com”Step 2. Click on “Registration Form”Step
    //  3. Verify that following options for programming languages are displayed: c++, java, JavaScript

    @Test
    public void test2(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

         driver.findElement(By.linkText("Registration Form")).click();

      driver.findElement(By.cssSelector("input[id='inlineCheckbox1']")).click();
       driver.findElement(By.cssSelector("input[id='inlineCheckbox2']")).click();
      driver.findElement(By.cssSelector("input[id='inlineCheckbox3']")).click();









    }


}
