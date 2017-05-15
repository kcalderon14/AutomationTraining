package com.gap.atpractice.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;


/**
 * Created by auto on 24/04/17.
 */
public class TakeScreenshot {

    public static void takeScreenshot(WebDriver driver, String pathName ) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File(pathName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
