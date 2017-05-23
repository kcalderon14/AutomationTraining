package com.gap.atpractice.testSuites;

import com.gap.atpractice.pageobject.LoginPage;
import com.gap.atpractice.selenium.SeleniumBase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by auto on 06/04/17.
 */
@Test(groups = "loginAll")
public class TestLogin {

    private static WebDriver driver;

    @BeforeClass
    private void initialize() {
        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.setUp("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Parameters({"userNameText1","passwordText1"})
    @Test
    public void LoginSuccessful(String userNameText1, String passwordText1){
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
        lp.userLogin(userNameText1,passwordText1);
        driver.close();
    }
}
