package org.orangeHRM.test;

import org.orangeHRM.pageobjects.ResetPasswordPage;
import org.orangeHRM.pageobjects.ResetPasswordLinkPage;
import org.orangeHRM.seleniumbase.OrangeHRMBase;
import org.testng.Assert;

public class TC003_ResetPassword extends OrangeHRMBase {
    public void ResetTest() {
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        String resetPassword = resetPasswordPage.getResetPasswordHeader();
        Assert.assertEquals(resetPassword, "Reset Password");
        String usernameLabel = resetPasswordPage.getUsernameLabel();
        Assert.assertEquals(usernameLabel, "Username");
        resetPasswordPage.resetPassword(username);

        ResetPasswordLinkPage resetPasswordLinkPage = new ResetPasswordLinkPage();
        String resetPasswordMail = resetPasswordLinkPage.ResetPasswordLink();
        Assert.assertEquals(resetPasswordMail, "Reset Password link sent successfully");

    }


}
