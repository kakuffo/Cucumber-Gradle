package com.whiteleys.zoo.deivers;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kakuffo on 18/09/15.
 */
public class Drivers {
    private static org.openqa.selenium.WebDriver driver = null;

    public void getDriver() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/login.html");
    }

}
