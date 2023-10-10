package org.orangeHRM.pageobjects;

import org.openqa.selenium.By;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase {
    public String getHeader() {
        return driver.findElement(By.xpath("//div/span/h6")).getText();
    }
    public DashboardPage profile() {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        return new DashboardPage();
    }
    public LoginPage LogOut() {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        return new LoginPage();
    }
}
