package com.cybertek.tests.examples;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testcase1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://ebay.com");

        WebElement searchTerm = driver.findElement(By.xpath("//input[@type='text']"));

        searchTerm.sendKeys("apple airphone");

        WebElement searchButton = driver.findElement(By.cssSelector(".btn.btn-prim.gh-spr"));
        searchButton.click();

        WebElement result = driver.findElement(By.cssSelector(".srp-controls__count-heading"));
        String actualResult = result.getText();
        System.out.println(actualResult);

    }
}
