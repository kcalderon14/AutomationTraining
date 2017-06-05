package com.gap.atpractice.testSuites;

import com.gap.atpractice.dataprovider.DataProviderLogin;
import com.gap.atpractice.pageobject.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by auto on 01/06/17.
 */


public class TestLoginSeveralTimes extends TestSuitesBase{
    String param1;
    String param2;

    public TestLoginSeveralTimes(String param1, String param2){
        this.param1 = param1;
        this.param2 = param2;
    }

    @Test(groups = "loginFromFactory")
    public void LoginFromFactory(){
            LoginPage lp = (LoginPage) new LoginPage(driver).get();
            lp.userLogin(param1, param2);
            closeBrowser();
    }

}

