package com.orangehrm.pages.AdminManage.UserManager;

import org.openqa.selenium.By;

import com.orangehrm.pages.LoginPage;

public class UserPage extends LoginPage {
    private By userTitle = By.xpath("//div/h5[text() = 'System Users']");
    private By usernameInput = By.xpath("//div[@class = 'oxd-input-group oxd-input-field-bottom-space']//div//input[@class = 'oxd-input oxd-input--active']");
    private  By buttonSubmit = By.xpath("/div//button[text() = 'Search']");
    private  By dropdownUserRole = By.xpath("//div[text() = '-- Select --']");

    private By RoleValue(String role) {
         return By.xpath("//div[@class = contains(@class = 'oxd-select-text-input')][text() = '"+role+"']");
    } 

    public String getTitle(){
        deLay(2);
        return findElement(userTitle).getText();
    }

    public void clickSearchWithText(String input) {
        findElement(usernameInput).sendKeys(input);
        deLay(2);
        findElement(buttonSubmit).click();
    }
}
//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]