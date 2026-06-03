package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser) {

        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        return driver;
    }
}