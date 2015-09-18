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

    public static WebElement pswField(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement submittButton(WebDriver driver) {
        element = driver.findElement(By.className("button"));
        return element;
    }

    public static WebElement notRegistered(WebDriver driver) {
        element = driver.findElement(By.linkText("Not registered?"));
        return element;
    }

    public static String getPageUrl(WebDriver driver) {

        String pageUr = driver.getCurrentUrl();
        return pageUr;
    }

    public static String getTitle(WebDriver driver) {

        String title = driver.getTitle();
        return title;

    }

    public static String getSource(WebDriver driver) {

        String source = driver.getPageSource();
        return source;
    }

    public static void setUserName(WebDriver driver, CharSequence userName) {
        userNameField(driver).sendKeys(userName);
    }

    public static void setPassword(WebDriver driver, CharSequence psw) {
        pswField(driver).sendKeys(psw);
    }

    public static void clickRegister(WebDriver driver) {
        submittButton(driver).click();
    }

    public static void quit(WebDriver driver) {

        driver.quit();
    }


}
