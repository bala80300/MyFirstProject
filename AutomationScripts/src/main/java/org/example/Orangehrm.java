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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // webpage takes time to load, so added an implicit wait

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

        /* Admin Module */

        //searching the user
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("John.Smith");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        String search_result = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
        if(search_result.equals("John.Smith")) {
            System.out.println("User is present");
        }
        else {
            System.out.println("User is not present");
        }
        


driver.quit();
    }
}
