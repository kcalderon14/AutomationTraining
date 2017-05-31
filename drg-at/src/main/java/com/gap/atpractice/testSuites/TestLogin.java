package com.gap.atpractice.testSuites;

import com.gap.atpractice.dataprovider.DataProviderLogin;
import com.gap.atpractice.pageobject.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;


/**
 * Created by auto on 06/04/17.
 */
@Test(groups = "loginAll")
public class TestLogin extends TestSuitesBase{

   @Test(groups = "test001")
   @Parameters({"userNameText1","passwordText1"})
    public void LoginSuccessful(String userNameText1, String passwordText1){
        LoginPage lp = (LoginPage) new LoginPage(driver).get();
        lp.userLogin(userNameText1, passwordText1);
        lp.goToCreateFormulary();
        driver.close();
    }

    @Test(groups = "getData", dataProvider = "getData", dataProviderClass = DataProviderLogin.class)
    public void LoginWithDP(String name, String password){
      LoginPage lp = (LoginPage) new LoginPage(driver).get();
      lp.userLogin(name, password);
      driver.quit();
    }

    @Test(groups = "loginFromFile", dataProvider = "txtUsers", dataProviderClass = DataProviderLogin.class)
    public void LoginFromFile(String name, String password){
        LoginPage lp = (LoginPage) new LoginPage(driver).get();
        lp.userLogin(name, password);
        driver.quit();
    }

}
