package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.orangehrm.pages.AdminManage.UserManager.UserPage;

public class LoginPage  extends BasePage{
    private By usernameField = By.xpath("//input[@name = 'username']");
    private By passwordField = By.xpath("//div/input[@name = 'password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By errorMess = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    private By userManagementMenu = By.xpath("//li//span[text() = 'Admin']");


    public void setUsername(String username){
        set(usernameField, username);
    }
    public void setPassword(String password){
        set(passwordField, password);
    }

    public DashboardPage clickLoginButton() {
        click(buttonLogin);
        return new DashboardPage();
    }

    public DashboardPage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public UserPage clickUserManagementMenu() {
        click(userManagementMenu);
        return new UserPage();
    }

    public String getErrorMessage() {
        return findElement(errorMess).getText();
    }

}
