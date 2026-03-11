package com.testingacademy.Input_Select_Alerts_Radio;

import com.testingacademy.CommonToAll;
import com.testingacademy.SeleniumWaits.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Input_checkbox_Radio extends CommonToAll {
    @Test
    public void test_select() {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByVisibleText("Option 2");

        select.selectByIndex(1);

        closeBrowser(driver);
    }
}
