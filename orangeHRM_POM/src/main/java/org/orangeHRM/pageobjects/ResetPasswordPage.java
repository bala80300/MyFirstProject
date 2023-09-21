package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class ResetPasswordPage extends OrangeHRMBase {
    public String ResetPassword() {
        return driver.findElement(By.xpath("//div/h6")).getText();
    }
}
