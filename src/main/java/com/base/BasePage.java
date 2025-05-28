package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String value) {
        findElement(locator).clear();
        findElement(locator).sendKeys(value);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public static void deLay(int milisSeconds) {
        try {
            Thread.sleep(milisSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void quit(int milisSeconds) {
        deLay(milisSeconds);
        if (driver != null) {
            driver.quit();
        }
    }
}
