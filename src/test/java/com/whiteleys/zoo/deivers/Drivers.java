package com.whiteleys.zoo.deivers;

import com.whiteleys.zoo.pageobjects.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kakuffo on 18/09/15.
 */
public class Drivers {
    private static WebDriver driver = null;

    public void getDriver() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/login.html");
    }

    public void logIn() {
        Home.userNameField(driver).isEnabled();
        Home.userNameField(driver).sendKeys("EE");
        Home.pswField(driver).sendKeys("eee");

    }
}
