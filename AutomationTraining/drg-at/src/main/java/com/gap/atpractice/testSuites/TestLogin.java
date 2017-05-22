package com.gap.atpractice.testSuites;


import com.gap.atpractice.pageobject.LoginPage;
import com.gap.atpractice.selenium.SeleniumBase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


/**
 * Created by auto on 06/04/17.
 */
public class TestLogin {

    private static WebDriver driver;

    private static void initialize() {
        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.setUp("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void main(String [] args){

        initialize();
        LoginPage lp = new LoginPage(driver);
        lp.goToLogin();
        lp.userLogin("testdrg2@eisai.com","Admin1");
        System.out.print("Test ending");
    }
}
