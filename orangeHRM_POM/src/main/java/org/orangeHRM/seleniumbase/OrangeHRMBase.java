package org.orangeHRM.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class OrangeHRMBase {
    String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static WebDriver driver = null;
    public String userName = "Admin";
    public String passWord = "admin123";

    @BeforeMethod
    public void StartApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(URL);
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}
