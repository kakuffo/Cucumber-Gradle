package com.whiteleys.zoo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kakuffo on 17/09/15.
 */
public class Home {


    private static WebElement element = null;

    public static WebElement userNameField(WebDriver driver) {
        element = driver.findElement(By.id("username"));
        return element;
    }

    public static WebElement pswField(WebElement driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement submittButton(WebElement driver) {
        element = driver.findElement(By.className("button"));
        return element;
    }

    public static WebElement notRegistered(WebElement driver) {
        element = driver.findElement(By.linkText("Not registered?"));
        return element;
    }


}
