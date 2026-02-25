package com.testingacademy;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium {
    public static void main(String[] args) {
        SearchContext driver1 = new ChromeDriver();
        SearchContext driver2 = new EdgeDriver();
        SearchContext driver3 = new FirefoxDriver();

        WebDriver d1 = new ChromeDriver();
        RemoteWebDriver d2 = new FirefoxDriver();
        FirefoxDriver d3 = new FirefoxDriver();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
}
