package com.gap.atpractice.testSuites;

import com.gap.atpractice.pageobject.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * Created by auto on 06/04/17.
 */
@Test(groups = "loginAll")
public class TestLogin extends TestSuitesBase{


    @Parameters({"userNameText1","passwordText1"})
    @Test
    public void LoginSuccessful(String userNameText1, String passwordText1){
        LoginPage lp = (LoginPage) new LoginPage(driver).get();
        lp.userLogin(userNameText1, passwordText1);
        driver.close();
    }
}
