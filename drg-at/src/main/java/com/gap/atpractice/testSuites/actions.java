package com.gap.atpractice.testSuites;

import com.gap.atpractice.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;


/**
 * Created by auto on 04/05/17.
 */
public class actions {

    private static WebDriver driver;
    private static Actions action;

    private static void initialize() {
        String url = "https://jsfiddle.net/L6qggtub/2/show/";
        System.out.println(url);
        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.setUp("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        WebElement iframe = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iframe);
        action = new Actions(driver);
    }

    private static void dClick(){

        WebElement text=driver.findElement(By.id("double_click"));
        action.doubleClick(text);
        System.out.println("Double Click on Text");
    }

    private static void dragAndDrop (){
        WebElement variable1=driver.findElement(By.id("draggable"));
        WebElement variable2=driver.findElement(By.id("droppable"));
        action.dragAndDrop(variable1,variable2).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Drag and Drop");
    }



    public static void main(String [] args){

        //Load login page
        actions.initialize();
        actions.dClick();
        actions.dragAndDrop();
        System.out.print("Run the 3 Methods");
        driver.close();

    }
}

