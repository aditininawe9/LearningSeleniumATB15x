package com.testingacademy.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaskCSSSelector {
    @Test
    public void taskCss() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Test");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Test2");

        WebElement gender = driver.findElement(By.cssSelector("#sex-1"));
        gender.click();
    }
}
