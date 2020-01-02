package com.cybertek.tests.examples;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class testcase2 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://ebay.com");

        String title = driver.getTitle();
        System.out.println(title);

        WebElement searchTermEbay = driver.findElement(By.cssSelector("input[type='text']"));
       searchTermEbay.sendKeys("Electronics, Cars, Fashion, Collectibles & More");

      // System.out.println(title.contains("Cars"));

        Assert.assertTrue("Electronics, Car, Fashion, Collectibles & More".contains("Cars"),"verify cars in searchterm");


    }
}
