package com.whiteleys.zoo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kakuffo on 17/09/15.
 */
public class LoginView {


    private static WebElement element = null;

    public static WebElement userNameField(WebDriver driver) {
        element = driver.findElement(By.id("username"));
        return element;
    }


}
