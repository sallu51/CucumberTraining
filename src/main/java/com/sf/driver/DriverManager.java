package com.sf.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driver) {
        dr.set(driver);
    }

    static void unload(){
        dr.remove();
    }

}
