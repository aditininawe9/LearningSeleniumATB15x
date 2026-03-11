package com.testingacademy.ActionClasses;

import com.testingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassSpiceJet extends CommonToAll {
    @Test
    public void testSpiceJet(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement origin = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(origin).click().sendKeys("blr")
                .moveToElement(destination).click().sendKeys("del")
                .build().perform();
    }
}
