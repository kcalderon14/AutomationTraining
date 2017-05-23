package com.gap.atpractice.pageobject;

import com.gap.atpractice.selenium.SeleniumBase;
import com.gap.atpractice.utils.TakeScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by auto on 15/05/17.
 */

public class LoginPage {

    private static WebDriver driver;

    //Web Elements
    //This is as Page Factory
    @FindBy(id="UserName") private WebElement userName;
    @FindBy(id="Password") private WebElement password;
    @FindBy(xpath = "//input[@value = 'Log in']") private WebElement btn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToLogin(){
        driver.get("https://eisai.devweb01.fingertipformulary.com/login");
    }

    public void pageLoad(){
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
        if(js.executeScript("return document.readyState").equals("complete")){
            driver.findElement( By.id("user_submit") );
            System.out.println("Page Loaded");
        } else{
            System.out.println("Page wasn't Loaded");
        }
    }


    public HomePage userLogin(String userNameText, String passwordText) {
        userName.sendKeys(userNameText);
        password.sendKeys(passwordText);
        btn.click();
        System.out.println("Page Loaded to entry user and pass");
        return new HomePage(this.driver);
    }

    public void validateLoginPage() {
        driver.findElement(By.id("UserName")).isDisplayed();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test.png");
    }

}
