package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Orangehrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // webpage takes time to load, so added an implicit wait

        // Login the webpage using correct credentials
        WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement login_button = driver.findElement(By.xpath("//*[@type='submit']"));
        login_button.click();
        Thread.sleep(5000);


    driver.quit();
    }
}