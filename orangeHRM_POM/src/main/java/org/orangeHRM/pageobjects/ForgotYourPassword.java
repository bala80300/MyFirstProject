package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class ForgotYourPassword extends OrangeHRMBase {
    public String getResetPasswordPage() {
        return driver.findElement(By.xpath("//form/h6")).getText();
    }

    public ForgotYourPassword enterUsername(String username) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        return this;
    }

    public ForgotYourPassword clickResetPassword() {
        driver.findElement(By.xpath("//button[text()=' Reset Password ']")).click();
        return this;
    }

    public void resetPassword(String username) {
        getResetPasswordPage();
        enterUsername(username);
        clickResetPassword();
    }



}
