package com.cybertek.tests.day5_xpath;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
        /**
         * navigate to amazon.com
         * type selenium in the searchbox
         * click search button
         */
        public static void main(String[] args) {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("http://amazon.com");

            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("selenium");

            WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
            searchButton.click();
        }
}
