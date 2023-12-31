package org.orangeHRM.test;

import org.orangeHRM.pageobjects.LoginPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_Login extends OrangeHRMBase {
    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage();

        boolean usernameLabel = lp.getUserNameLabel();
        Assert.assertTrue(usernameLabel);
        boolean passwordLabel = lp.getPasswordLabel();
        Assert.assertTrue(passwordLabel);


        lp.enterUserName(username);
        lp.enterPassword(password);
        lp.clickLogin();


    }
}
