package com.whiteleys.zoo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kakuffo on 17/09/15.
 */
public class Register {

    private static WebElement element = null;

    public static WebElement userNameField(WebDriver driver) {
        element = driver.findElement(By.id("username"));
        return element;
    }

    public static WebElement pswField(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement retryPswField(WebDriver driver) {
        element = driver.findElement(By.id("password2"));
        return element;
    }

    public static WebElement femaleButton(WebDriver driver) {
        element = driver.findElement(By.id("sex1"));
        return element;
    }

    public static WebElement maleButton(WebDriver driver) {
        element = driver.findElement(By.id("sex2"));
        return element;
    }

    public static WebElement dobDay(WebDriver driver) {
        element = driver.findElement(By.id("dobDay"));
        return element;
    }

    public static WebElement dobMonth(WebDriver driver) {
        element = driver.findElement(By.id("dobMonth"));
        return element;
    }

    public static WebElement dobYear(WebDriver driver) {
        element = driver.findElement(By.id("dobYear"));
        return element;
    }

    public static WebElement postCode(WebDriver driver) {
        element = driver.findElement(By.id("postcode"));
        return element;
    }

    public static WebElement registerButtone(WebDriver driver) {
        element = driver.findElement(By.className("button"));
        return element;
    }

    public static WebElement backtologin(WebDriver driver) {
        element = driver.findElement(By.linkText("Back to login"));
        return element;

    }

}
