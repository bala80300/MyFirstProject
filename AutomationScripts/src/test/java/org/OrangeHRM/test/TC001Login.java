package org.OrangeHRM.test;

import org.orangeHRM.pages.LoginPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001Login extends OrangeHRMBase {
    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage();
        //validating the webelements
        boolean usernameLabel = lp.getUsernameLabel();
        Assert.assertTrue(usernameLabel);
        boolean passwordlabel = lp.getPasswordlabel();
        Assert.assertTrue(passwordlabel);

        //passing the values
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLogin();

    }
}
