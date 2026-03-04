package com.testingacademy.XPath_Axes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_XpathAxes {
    @Test
    @Description("Test case Description")
    public void webTables() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //table[@id="customers"]/tbody/tr[5]/td[2]
        //tr[i] => 1,2,3,4,5
        //td[j] => 1,2,3

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        Integer row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        Integer column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/td[2]")).size();
        for(int i = 1; i <= row; i++){
            for (int j = 1; j <= column; j++) {
                String dynamic_path = first_part+i+second_part+j+third_part;
                System.out.println("-----path---"+dynamic_path);
            }
        }
    }
}
