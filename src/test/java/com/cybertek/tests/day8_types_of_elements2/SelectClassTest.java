package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object by passing the element as a constructor
        Select stateList = new Select(dropdownElement);

        //getOptions--> returns all the availaible options from the dropdown list
        List<WebElement> options = stateList.getOptions();

        System.out.println(options.size());

        for (WebElement option : options) {

            System.out.println(option.getText());
        }

}

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object by passing the element as a constructor
        Select stateList = new Select(dropdownElement);

        //getOptions--> returns all the availible options from the dropdown list
        List<WebElement> options = stateList.getOptions();

        //verify that first option is "Select a State"
        String expectedOption = "Select a State";
        String actualOption = stateList.getFirstSelectedOption().getText();
        System.out.println(actualOption);

        Assert.assertEquals(actualOption,expectedOption, "Verify first selection is select a state");

        //how to select options from the dropdown?
        //1.using visible text("texas")
        //selectByVisibleText("text") --> selecting base on the visible text

        Thread.sleep(2000);
        stateList.selectByVisibleText("Texas");
        actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Texas");

        //2.using index number
        //total option -->52
        stateList.selectByIndex(51);
        System.out.println(stateList.getFirstSelectedOption().getText());

        //using value
        Thread.sleep(2000);
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());


    }
    }


