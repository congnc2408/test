package admintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.AdminManage.UserManager.AdminPage;
import com.orangehrm.pages.AdminManage.UserManager.UserPage;

import base.BaseTest;


public class UserManageTest extends BaseTest {
   // By userManagementMenu = By.xpath("//li//span[text() = 'Admin']");
    //By userTitle = By.xpath("//div/h5[Text() = 'System Users']");
    AdminPage adminPage;
    @Test(priority = 1)
    public void clickUserManagementMenu() {
        var userManagementMenuPage = loginPage.clickUserManagementMenu();
        String actual = userManagementMenuPage.getTitle();
        String expected = "System Users";
        Assert.assertEquals(actual, expected, "User Management Menu title does not match expected value.");
        
    }

    @Test
    public void searchUserByUsername() {
        String username = "Admin";
        adminPage = new AdminPage();
       // adminPage.setDriver(driver);
      
        adminPage.clickSearchWithText(username);
        By mandaText = By.name("(1) Record Found");
        String actual =  adminPage.findElement(mandaText).getText();
        String expected = "(1) Record Found";
        Assert.assertEquals(actual,expected, "Search result does not contain expected username.");
    }

}
