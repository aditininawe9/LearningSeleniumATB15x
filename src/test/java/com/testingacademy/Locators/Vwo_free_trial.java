package com.testingacademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vwo_free_trial {
    @Test
    public void  SignUpPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/");

//        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("admin");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement submit_Btn = driver.findElement(By.tagName("button"));
        submit_Btn.click();

        //Assertion
        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect. ");

    }
}
