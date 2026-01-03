package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("admin", "admin");

        Assert.assertTrue(driver.getTitle().contains("Altoro Mutual"));
    }
}
