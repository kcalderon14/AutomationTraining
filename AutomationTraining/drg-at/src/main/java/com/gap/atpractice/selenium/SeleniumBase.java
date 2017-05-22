package com.gap.atpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by auto on 06/04/17.
 * Se crea el manejo del browser
 * Se tiene que crear un metodo setUp
 * Retornar un wedriver
 * crear un metodo initchrome que devuelva el webdriver
 * initfirefox
 */

public class SeleniumBase {
    private WebDriver driver;

    public WebDriver setUp (String browserName){
       switch (browserName){
           case "Chrome":
               initChrome();
               break;
           case "Firefox":
               initFirefox();
               break;
           case "IE":
               initIE();
               break;
           default: String browserDefault = "Invalid browser";
           break;
       }
        return driver;
    }



    private void initChrome (){
        driver = new ChromeDriver();
    }

    private void initFirefox(){
        driver = new FirefoxDriver();
    }

    private void initIE(){
        driver = new InternetExplorerDriver();
    }

}

