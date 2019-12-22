package com.cybertek.tests.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("fatih");

        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("fati");

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("fat@mail");
        driver.findElement(By.cssSelector("input[id='inlineCheckbox1']")).click();
        driver.findElement(By.cssSelector("input[id='inlineCheckbox2']")).click();
        driver.findElement(By.cssSelector("input[id='inlineCheckbox3']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    }


