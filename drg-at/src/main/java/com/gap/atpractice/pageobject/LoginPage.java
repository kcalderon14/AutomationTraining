package com.gap.atpractice.pageobject;

import com.gap.atpractice.botstyletest.BotStyle;
import com.gap.atpractice.utils.TakeScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


/**
 * Created by auto on 15/05/17.
 */

public class LoginPage{
    private static WebDriver driver;

    //Web Elements
    By userName = By.id("UserName");
    By password = By.id("Password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
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
        } else
            {
                System.out.println("Page wasn't Loaded");
            }
    }

    public HomePage userLogin(String userNameText, String passwordText) {
        driver.findElement(userName).sendKeys(userNameText);
        driver.findElement(password).sendKeys(passwordText);
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
        System.out.println("Page Loaded to entry user and pass");
        return new HomePage(driver);
    }

    public void validateLoginPage(){
        driver.findElement(By.id("UserName")).isDisplayed();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test.png");
    }

}
