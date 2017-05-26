package com.gap.atpractice.pageobject;

import com.gap.atpractice.botstyletest.BotStyle;
import com.gap.atpractice.utils.TakeScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by auto on 25/05/17.
 */
public class LoginPage extends PageBase{

    //Web Elements
    //This is as Page Factory
    @FindBy(id="UserName") private WebElement userName;
    @FindBy(id="Password") private WebElement password;
    @FindBy(xpath = "//input[@value = 'Log in']") private WebElement btn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void load(){
        driver.get(PRINCIPAL_URL);
    }

    public void isLoaded() throws Error{
        String url = driver.getCurrentUrl();
        assertTrue("Not on the issue entry page" + url, url.contains(URL_CONTAINS));
    }

    public HomePage userLogin(String userNameText, String passwordText) {
        botDriver.type(userName, userNameText);
        botDriver.type(password, passwordText);
        btn.click();
        System.out.println("Page Loaded to entry user and pass");
        return new HomePage(this.driver);
    }

    public void takeScreenshot1() {
        driver.findElement(By.id("UserName")).isDisplayed();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test.png");
    }

}