package com.gap.atpractice.pagefactory;

import com.gap.atpractice.botstyletest.BotStyle;
import com.gap.atpractice.pageobject.HomePage;
import com.gap.atpractice.utils.TakeScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by auto on 25/05/17.
 */
public class LoginPageFactory{
    private static WebDriver driver;
    BotStyle botDriver;

    //Web Elements
    //This is as Page Factory
    @FindBy(id="UserName") private WebElement userName;
    @FindBy(id="Password") private WebElement password;
    @FindBy(xpath = "//input[@value = 'Log in']") private WebElement btn;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.botDriver = new BotStyle(driver);
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
        botDriver.type(userName, userNameText);
        botDriver.type(password, passwordText);
        btn.click();
        System.out.println("Page Loaded to entry user and pass");
        return new HomePage(this.driver);
    }

    public void validateLoginPage() {
        driver.findElement(By.id("UserName")).isDisplayed();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test.png");
    }

}
