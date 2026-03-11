package com.testingacademy.Input_Select_Alerts_Radio;

import com.testingacademy.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts extends CommonToAll {
    @Test
    public void testAlerts() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println("Title "+driver.getTitle());
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement elementPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

//        element.click();
//        waitForAlert(driver, 5);

//        elementConfirm.click();
//        waitForAlert(driver, 5);

        elementPrompt.click();
        waitForAlert(driver, 5);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Aditi");

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: Aditi");


    }
}
