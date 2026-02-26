package com.testingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://katalon-demo-cura.herokuapp.com/");
        driver1.manage().window().maximize();
        driver1.manage().window().minimize();

        driver.quit();
    }
}
