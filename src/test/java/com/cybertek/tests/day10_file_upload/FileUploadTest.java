package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

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
        driver.get("http://practice.cybertekschool.com/upload");

            String projectPath = System.getProperty("user.dir");
            String relativePath = "src/test/resources/testfile.text";

            String filePath = projectPath +  "/" + relativePath;


       driver.findElement(By.name("file")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFilename,"testfile.txt","verify the file name");

    }

    
}
