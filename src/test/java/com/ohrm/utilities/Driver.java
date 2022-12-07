package com.ohrm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver(){
    }
     private static WebDriver driver;

    public static WebDriver getDriver(){
        // if driver is not instantiated before create driver
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        }
        // if we have existing driver, go ahead and return driver
        else {
            return driver;
        }
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public static void setDriver(){
        // future purpose
    }
}
