package org.orangeHRM.test;

import org.orangeHRM.pageobjects.DashboardPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Dashboard extends OrangeHRMBase {
  //  LoginPage loginpage = new LoginPage();
    TC001_Login loginTestObject = new TC001_Login();
    @Test
    public void DashboardTest() {
        //loginpage.login(username,password);
        loginTestObject.loginTest();
        DashboardPage dp = new DashboardPage();
        String headerName = dp.getHeader();
        Assert.assertEquals(headerName, "Dashboard");
    }
}
