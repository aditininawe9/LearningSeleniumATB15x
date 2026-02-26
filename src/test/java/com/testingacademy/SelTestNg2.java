package com.testingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SelTestNg2 {

    @Test
    public void testSel() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

        //AssertJ
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Google");
        driver.quit();
    }
}
