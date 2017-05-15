package com.gap.atpractice.testSuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * Created by auto on 10/05/17.
 */
public class FFCapability {
    private static WebDriver driver;


    private static void testFF() {

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.startup.homepage",
                "http://www.google.com");
        profile.setPreference("browser.fullscreen.autohide",true);
        profile.setPreference("browser.cache.disk.enable", false);

        driver = new FirefoxDriver(profile);

    }

    public static void main(String[] args) {
    FFCapability.testFF();
    }
}


