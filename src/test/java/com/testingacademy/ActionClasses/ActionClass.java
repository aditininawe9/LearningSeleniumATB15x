package com.testingacademy.ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
    @Test
    public void testActionClass(){
        WebDriver driver = new ChromeDriver();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(firstName, "aditi").keyUp(Keys.SHIFT).perform();
    }

}
