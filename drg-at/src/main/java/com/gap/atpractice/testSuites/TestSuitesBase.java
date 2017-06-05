package com.gap.atpractice.testSuites;

import com.gap.atpractice.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by auto on 25/05/17.
 */

@Test(groups = "loginAll")
public class TestSuitesBase extends SeleniumBase{
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void initialize() {
        driver = super.setUp("Chrome");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
