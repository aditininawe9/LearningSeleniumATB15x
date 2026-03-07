package com.testingacademy.SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        try {
            WebElement element = driver.findElement(By.id("non-existant"));
            element.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        System.out.println("My other code");
    }
}
