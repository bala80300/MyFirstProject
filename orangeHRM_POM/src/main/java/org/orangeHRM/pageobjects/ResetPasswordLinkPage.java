package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class ResetPasswordLinkPage extends OrangeHRMBase {
    public String ResetPasswordLink() {
        return driver.findElement(By.xpath("//div/h6")).getText();
    }
}
