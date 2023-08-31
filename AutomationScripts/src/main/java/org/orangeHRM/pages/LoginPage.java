package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase {
    WebDriver driver = null;
    //locators
    public boolean getUsernameLabel() {
        return driver.findElement(By.xpath("//label[text()='Username']")).isDisplayed();
    }
    public boolean getPasswordlabel() {
        return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
    }

    //actions
    public void enterUsername(String username) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
    public void clickLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    public void clickForgotYourPassword() {
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
    }

    /**
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }


}
