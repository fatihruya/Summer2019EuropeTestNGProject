package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {

    /**
     * Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybe
     *
     *
     *
     */

    public static void main(String[] args) {

        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys
        emailInput.sendKeys("i@mail.com");

        //click on retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
       retrievePasswordButton.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String currentUrl =driver.getCurrentUrl();
        if(expectedUrl.equals(currentUrl)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
        }

        driver.close();




    }

}
