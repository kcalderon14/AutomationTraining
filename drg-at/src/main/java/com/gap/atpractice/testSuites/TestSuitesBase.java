package com.gap.atpractice.testSuites;

import com.gap.atpractice.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by auto on 25/05/17.
 */

@Test(groups = "loginAll")
public class TestSuitesBase {

    WebDriver driver;

    @BeforeClass
    public void initialize() {
        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.setUp("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
