package org.orangeHRM.test;

import org.orangeHRM.pageobjects.DashboardPage;
import org.orangeHRM.pageobjects.LoginPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004_Logout extends OrangeHRMBase {
    // creating the object for LoginPage class
    LoginPage lp = new LoginPage();

    // creating the object for DashboardPage class
    DashboardPage dp = new DashboardPage();
    @Test
    public void LogoutTest() {
        // created object for TC002_Dashboard class to Login the page & checking Dashboard is visible
        TC002_Dashboard DashboardTestObject = new TC002_Dashboard();
        DashboardTestObject.DashboardTest();

        //clicking on Profile dropdown in dashboard page
        dp.profile();
        // Clicking on logout button in dashboard page
        dp.LogOut();

        // verifying I'm in the login page after logging out from the website
        Assert.assertTrue(lp.loginLabel());
    }
}
