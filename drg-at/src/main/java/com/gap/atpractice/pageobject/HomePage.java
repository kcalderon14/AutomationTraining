package com.gap.atpractice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by auto on 15/05/17.
 */
public class HomePage {
    WebDriver driver;
    WebElement homePage;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
