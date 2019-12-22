package com.cybertek.tests.herokuapp;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase1 {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
         driver.quit();
    }

    @Test
    public void test1(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

driver.findElement(By.linkText("Registration Form")).click();
driver.findElement(By.name("birthday")).sendKeys("wrong_dob");

Boolean actualMessage = driver.findElement(By.xpath("//*[contains(text(),'The date of birth is not valid')]")).isDisplayed();

        Assert.assertTrue(actualMessage,"verify that message is displayed");

    }
}
