package com.orangehrm.pages.AdminManage.UserManager;

import org.openqa.selenium.By;

import com.orangehrm.pages.LoginPage;

public class UserPage extends LoginPage {
    private By userTitle = By.xpath("//div/h5[text() = 'System Users']");
    private By RoleValue(String role) {
         return By.xpath("//div[@class = contains(@class = 'oxd-select-text-input')][text() = '"+role+"']");
    } 

    public String getTitle(){
        deLay(2);
        return findElement(userTitle).getText();
    }

   
}
