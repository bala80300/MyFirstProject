package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase {


//    public LoginPage() {
//        this.driver = driver;
//    }

    public boolean getUserNameLabel() {
        return driver.findElement(By.xpath("//label[text()='Username']")).isDisplayed();
    }
    public boolean getPasswordLabel() {
        return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
    }
    /**
     * @param username
     * @return
     * @description - get data from the user and type in the username field
     */
    public LoginPage enterUserName(String username) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        return this;
    }

    /**
     * @param password
     * @return
     * @description - get data from the user and type in the password field
     */
    public LoginPage enterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }

    /**
     * @return
     * @description - click the login button
     */
    public DashboardPage clickLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new DashboardPage();
    }

    /**
     * @description - This function is used for login
     * @param username
     * @param password
     */
    public void login(String username, String password){
        enterUserName(username);
        enterPassword(password);
        clickLogin();
    }
}