package com.utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility extends Utility{

    private static Select findDropdown(By locator){
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text){
        findDropdown(locator).selectByVisibleText(text);
    }

    public static void selectByVisibleIndex(By locator, int index){
        findDropdown(locator).selectByIndex(index);
    }
    public static void selectByVisibleValue(By locator, String text){
        findDropdown(locator).selectByValue(text);
    }
    public static void deselectByVisibleValue(By locator, String text){
        findDropdown(locator).deselectByValue(text);
    }
    public static void deselectByVisibleIndex(By locator, int text){
        findDropdown(locator).deselectByIndex(text);
    }
    public static void deselectByVisibleText(By locator, String text){
        findDropdown(locator).deselectByIndex(0);
    }

    public static List<String> getAllSelectOption(By locator){
        List<WebElement> allSelectOptions = findDropdown(locator).getAllSelectedOptions();
        return allSelectOptions.stream().map(getText -> getText.getText()).collect(Collectors.toList());
    }
    

}
