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

    public static void clicRegister(WebDriver driver) {

        registerButtone(driver).click();

    }

    public static boolean getRegisterVisible(WebDriver driver) {

        boolean myregisterIsVisible = registerButtone(driver).isEnabled();
        return myregisterIsVisible;

    }
    public static WebElement backtologin(WebDriver driver) {
        element = driver.findElement(By.linkText("Back to login"));
        return element;

    }

    public static boolean getLogin(WebDriver driver) {
        boolean loginDisplayed = backtologin(driver).isDisplayed();
        return loginDisplayed;
    }

    public static boolean getregisterButtone(WebDriver driver) {
        boolean registerButtoneDisplayed = registerButtone(driver).isDisplayed();
        return registerButtoneDisplayed;
    }

    public static boolean getpostCode(WebDriver driver) {
        boolean postCodeDisplayed = postCode(driver).isDisplayed();
        return postCodeDisplayed;
    }

    public static boolean getdobYear(WebDriver driver) {
        boolean dobYearDisplayed = dobYear(driver).isDisplayed();
        return dobYearDisplayed;
    }

    public static boolean getdobMonth(WebDriver driver) {
        boolean dobMonthDisplayed = dobMonth(driver).isDisplayed();
        return dobMonthDisplayed;
    }

    public static boolean getdobDay(WebDriver driver) {
        boolean dobDayDisplayed = dobDay(driver).isDisplayed();
        return dobDayDisplayed;
    }

    public static boolean getmaleButton(WebDriver driver) {
        boolean maleButtonDisplayed = maleButton(driver).isDisplayed();
        return maleButtonDisplayed;
    }

    public static boolean getfemaleButton(WebDriver driver) {
        boolean femaleButtonDisplayed = femaleButton(driver).isDisplayed();
        return femaleButtonDisplayed;
    }


    public static boolean getpswField(WebDriver driver) {
        boolean pswFieldDisplayed = pswField(driver).isDisplayed();
        return pswFieldDisplayed;
    }

    public static boolean getuserNameField(WebDriver driver) {
        boolean userNameFieldDisplayed = userNameField(driver).isDisplayed();
        return userNameFieldDisplayed;
    }


}
