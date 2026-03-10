package MiniProjects;
//package

import com.testingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniProject1 extends CommonToAll {
    @Description("Verify MMt opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.makemytrip.com");
//        System.out.println(driver.getTitle());
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        openBrowser(driver, "https://www.makemytrip.com");
        waitForVisiblity(driver, 3, "//span[@data-cy='closeModal']");
        closeBrowser(driver);

    }
}
