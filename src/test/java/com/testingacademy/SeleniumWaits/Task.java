package com.testingacademy.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task {
    @Test
    public void methodTask() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Aditi");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("12345678");

        WebElement gender = driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement experience = driver.findElement(By.id("exp-2"));
        experience.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("09.06.1998");

        WebElement proffesion = driver.findElement(By.id("profession-1"));
        proffesion.click();

        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();

        WebElement continents = driver.findElement(By.id("continents"));
        Select select = new Select(continents);
        select.selectByVisibleText("Europe");

        WebElement commands = driver.findElement(By.id("selenium_commands"));
        Select select1 = new Select(commands);
        select1.selectByVisibleText("WebElement Commands");

        WebElement fileUpload  = driver.findElement(By.id("photo"));
        fileUpload.sendKeys("/Users/mayanksoni/Downloads/boom.png");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement downloadFile = driver.findElement(By.linkText("Click here to Download File"));
        downloadFile.click();


    }
}
