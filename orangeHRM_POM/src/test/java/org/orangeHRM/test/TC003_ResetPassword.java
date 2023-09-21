package org.orangeHRM.test;

import org.orangeHRM.pageobjects.ForgotYourPassword;
import org.orangeHRM.seleniumbase.OrangeHRMBase;

public class TC003_ResetPassword extends OrangeHRMBase {
    ForgotYourPassword fp = new ForgotYourPassword();
    fp.resetPassword();


}
