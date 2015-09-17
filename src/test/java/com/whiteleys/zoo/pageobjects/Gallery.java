package com.whiteleys.zoo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kakuffo on 17/09/15.
 */

public class Gallery {

    private static WebElement element = null;


    public static WebElement headerWrap(WebDriver driver) {
        element = driver.findElement(By.id("headerWrap"));
        return element;
    }


    public static WebElement linkLogOut(WebDriver driver) {
        element = driver.findElement(By.linkText("Logout"));
        return element;
    }

    public static WebElement myFavourites(WebDriver driver) {
        element = driver.findElement(By.linkText("My favourites"));
        return element;
    }

    public static WebElement gallery(WebDriver driver) {
        element = driver.findElement(By.linkText("Gallery"));
        return element;
    }

    public static WebElement viewJustFavourites(WebDriver driver) {
        element = driver.findElement(By.linkText("view just your favourites"));
        return element;
    }

}
