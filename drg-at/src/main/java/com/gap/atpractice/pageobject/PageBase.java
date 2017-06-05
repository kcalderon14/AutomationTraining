package com.gap.atpractice.pageobject;

import com.gap.atpractice.botstyletest.BotStyle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by auto on 25/05/17.
 */
public abstract class PageBase extends LoadableComponent<PageBase>{

    WebDriver driver;
    BotStyle botDriver;

    String PRINCIPAL_URL = "https://eisai.devweb01.fingertipformulary.com";
    String URL_CONTAINS = "decisionresourcesgroup";
    String URL_CREATE_FORMULARY = "/publisher/new";

    public PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.botDriver = new BotStyle(driver);
    }

}
