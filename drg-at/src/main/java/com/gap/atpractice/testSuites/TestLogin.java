package com.gap.atpractice.testSuites;

import com.gap.atpractice.selenium.SeleniumBase;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import com.gap.atpractice.utils.TakeScreenshot;

/**
 * Created by auto on 06/04/17.
 */
public class TestLogin {
    private static WebDriver driver;

    private static void initialize() {
        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.setUp("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eisai.devweb01.fingertipformulary.com/login");
    }

    private static void pageLoad(){
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
        if(js.executeScript("return document.readyState").equals("complete")){
            driver.findElement( By.id("user_submit") );
            System.out.println("Page Loaded");
        } else{
            System.out.println("Page wasn't Loaded");
        }
    }

    private static void fourElements(){
        try{
            driver.findElement(By.id("user_password"));
            driver.findElement(By.id("user_password_confirmation"));
            driver.findElement(By.id("user_first_name"));
            driver.findElement(By.id("user_last_name"));
            System.out.println("Element(s) found");
        }catch (NoSuchElementException ex) {
            System.out.println("Element(s) not found");
            ex.printStackTrace();

        }
    }

    private static void twoElements(){
        try{
            driver.findElement(By.cssSelector("#user_submit")).isDisplayed();
            driver.findElement(By.cssSelector("img[alt='Eisai']")).isDisplayed();
            System.out.println("Element(s) found by CSS");
        }catch (NoSuchElementException ex){
            System.out.println("Element(s) not found by CSS");
        }
    }

    public static void main(String [] args){

        //Load login page
        initialize();
        //Validate login page is displayed
        driver.findElement(By.id("UserName")).isDisplayed();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test.png");
        //Insert user and password
        driver.findElement(By.id("UserName")).sendKeys("testdrg2@eisai.com");
        driver.findElement(By.id("Password")).sendKeys("Admin1");
        //Click on Login using just Xpath
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
        //Validate that Home Page is loaded using javascript executor
        pageLoad();
        TakeScreenshot.takeScreenshot(driver, "./src/main/resources/screenshots/test2.png");
        //Look for 4 elements in the page and validate they are present
        fourElements();
        //Look for 2 items using css that they are visible
        twoElements();
        System.out.print("Test ending");

        driver.close();


       /** try {
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement we = driver.findElement(By.name("q"));
            we.sendKeys("Selenium");
            we.submit();
            Thread.sleep(5000);  // Let the user actually see something!

            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        **/

    }
}
