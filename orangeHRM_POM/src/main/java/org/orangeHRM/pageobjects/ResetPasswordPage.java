package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class ResetPasswordPage extends OrangeHRMBase {
    public String getResetPasswordHeader() {
        return driver.findElement(By.xpath("//form/h6")).getText();
    }

    public String getUsernameLabel() {
        return  driver.findElement(By.xpath("//label[text()='Username']")).getText();
    }

    public ResetPasswordPage enterUsername(String username) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        return this;
    }

    public ResetPasswordPage clickResetPassword() {
        driver.findElement(By.xpath("//button[text()=' Reset Password ']")).click();
        return this;
    }

    public void resetPassword(String username) {
        enterUsername(username);
        clickResetPassword();
    }



}
