package org.orangeHRM.seleniumbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrangeHRMBase{
    string URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static WebDriver driver = null;

    @beforemethod
    public void startApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @aftermethod
    public void tearDown() {
        driver.quit();
    }

}
