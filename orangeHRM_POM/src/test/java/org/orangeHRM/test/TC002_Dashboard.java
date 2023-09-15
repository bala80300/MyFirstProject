package org.orangeHRM.test;

import org.orangeHRM.pageobjects.DashboardPage;
import org.orangeHRM.pageobjects.LoginPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Dashboard extends OrangeHRMBase {
    LoginPage loginpage = new LoginPage();
    @Test
    public void DashboardTest() {
        loginpage.login(userName,passWord);
        DashboardPage dp = new DashboardPage();
        String headerName = dp.getHeader();
        Assert.assertEquals(headerName, "Dashboard");
    }
}
