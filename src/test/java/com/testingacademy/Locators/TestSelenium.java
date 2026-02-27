package com.testingacademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium {
    @Test
    public void test_app_vwo_com() throws InterruptedException {
        //Driver manager
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Locators

        //<input type="email"
        //class="text-input W(100%)"
        //name="username"
        //vwo-html-translate-attr="placeholder"
        //vwo-html-translate-placeholder="login:enterEmailID"
        //id="login-username"
        //data-qa="hocewoqisi"
        //placeholder="Enter email ID"
        //data-gtm-form-interact-field-id="0">

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        //password

        //<input type="password"
        // class="text-input W(100%) Pend(36px)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password"
        // data-gtm-form-interact-field-id="1">

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin@1234");

        // submit

        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(24px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica">
        // <span class="icon loader D(n)"
        // data-qa="zuyezasugu"></span>
        // <span data-qa="ezazsuguuy"
        // vwo-html-translate="login:signIn">Sign in</span>
        // </button>
        WebElement submitBtn = driver.findElement(By.id("js-login-btn"));
        submitBtn.click();

        //<div class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        error_message.getText();


        WebElement Start_a_free_trial = driver.findElement(By.linkText("Start a free trial"));
        Start_a_free_trial.click();
        Thread.sleep(500);


        //Assertions
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

    }
}
