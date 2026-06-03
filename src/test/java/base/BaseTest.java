package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import utils.ConfigReader;

public class BaseTest {

    public WebDriver driver;
    ConfigReader config;

    @BeforeMethod
    public void setup() {

        config = new ConfigReader();

        driver =
                DriverFactory.getDriver(
                        config.getBrowser());

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null) {
            driver.quit();
        }
    }
}