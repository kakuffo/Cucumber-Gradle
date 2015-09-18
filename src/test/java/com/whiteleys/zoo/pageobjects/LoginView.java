package com.whiteleys.zoo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kakuffo on 17/09/15.
 */
public class LoginView {


    private static WebElement element = null;

    public static WebElement Logout(WebDriver driver) {
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

    public static WebElement browseTheGallery(WebDriver driver) {
        element = driver.findElement(By.linkText("Browse the gallery"));
        return element;
    }
}
