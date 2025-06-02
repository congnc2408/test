package com.orangehrm.pages.AdminManage.UserManager;

import org.openqa.selenium.By;

import com.base.BasePage;

public class AdminPage extends BasePage {

    private By usernameInput = By.xpath("//input[@placeholder='Username']");
    private By buttonSubmit = By.xpath("//div//button[normalize-space()='Search']");
    ///private By dropdownUserRole = By.xpath("//div[text() = '-- Select --']");

    
     public void clickSearchWithText(String input) {
        findElement(usernameInput).sendKeys(input);
        deLay(2);
        findElement(buttonSubmit).click();
    }
}
