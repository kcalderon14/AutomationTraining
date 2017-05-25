package com.gap.atpractice.pageobject;

import com.gap.atpractice.botstyletest.BotStyle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by auto on 15/05/17.
 */
public class HomePage {

    WebDriver driver;
    WebElement homePage;
    BotStyle botDriver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.homePage = driver.findElement(By.id("user_submit"));
        this.botDriver = new BotStyle(driver);
    }
}
