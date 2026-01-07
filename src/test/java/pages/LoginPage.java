package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void login(String user, String pass) {

        // Click Sign In
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Sign In")
        )).click();

        // Wait for login page
        wait.until(ExpectedConditions.urlContains("login.jsp"));

        // Username
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("uid")
        )).sendKeys(user);

        // Password
        driver.findElement(By.name("passw")).sendKeys(pass);

        // Login button
        driver.findElement(By.name("btnSubmit")).click();
    }
}
