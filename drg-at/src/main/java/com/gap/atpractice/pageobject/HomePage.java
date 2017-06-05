package com.gap.atpractice.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by auto on 15/05/17.
 */
public class HomePage extends PageBase {

    WebElement homePage;

    /** this is to validate user is correctly login **/
    public HomePage(WebDriver driver){
        super(driver);
        this.homePage = driver.findElement(By.id("user_submit"));
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
    }
}
