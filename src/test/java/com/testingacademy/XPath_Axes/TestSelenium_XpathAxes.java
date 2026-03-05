package com.testingacademy.XPath_Axes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class TestSelenium_XpathAxes {
    @Test
    @Description("Test case Description")
    public void webTables() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //table[@id="customers"]/tbody/tr[5]/td[2]
        //tr[i] => 1,2,3,4,5
        //td[j] => 1,2,3

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        Integer row = driver.findElements(xpath("//table[@id='customers']/tbody/tr")).size();
        Integer column = driver.findElements(xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        System.out.println("row "+row+ " column "+column);
        for(int i = 2; i <= row; i++){
            for (int j = 1; j <= column; j++) {
                String dynamic_path = first_part+i+second_part+j+third_part;
                String data = driver.findElement(xpath(dynamic_path)).getText();
                System.out.println(data);
                if (data.contains("Helen")) {
                    String country_path = dynamic_path + "/following-sibling::td";
                    String country_path_text = driver.findElement(xpath(country_path)).getText();
                    System.out.println(country_path_text);
                }
            }
        }
    }
}
