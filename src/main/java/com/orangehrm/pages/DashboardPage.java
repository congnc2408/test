package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.base.BasePage;

public class DashboardPage extends BasePage {

    private By dashboardHeader = By.xpath("//h6[normalize-space()='Dashboard']");

    public boolean isDashboardHeaderDisplayed() {
        return findElement(dashboardHeader).isDisplayed();
    }

    public String getDashboardHeaderText() {
        return findElement(dashboardHeader).getText();
    }

}
