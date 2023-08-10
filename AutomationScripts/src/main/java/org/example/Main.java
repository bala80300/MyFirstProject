package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Login the webpage using correct credentials
        WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys("admin123");

        WebElement login_button = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        login_button.click();

driver.quit();
    }
}