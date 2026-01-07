package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.linkText("Sign Off")
        ));

        // Optional pause to visually see the page
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
