package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase {
    public String getHeader() {
        return driver.findElement(By.xpath("//div/span/h6")).getText();
    }
}
