package com.orangehrm.pages.AdminManage.UserManager;

import org.openqa.selenium.By;

import com.orangehrm.pages.LoginPage;

public class UserPage extends LoginPage {
    By userTitle = By.xpath("//div/h5[text() = 'System Users']");

    public String getTitle(){
        deLay(2);
        return findElement(userTitle).getText();
    }
}
