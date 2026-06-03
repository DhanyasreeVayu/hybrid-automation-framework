package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.TestDataProvider;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData",
          dataProviderClass = TestDataProvider.class)
    public void verifyLogin(String username,
                            String password) {

        driver.get("https://www.saucedemo.com/");

        LoginPage login =
                new LoginPage(driver);

        login.login(username, password);

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("inventory"));
    }
}