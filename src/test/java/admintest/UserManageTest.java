package admintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseTest;


public class UserManageTest extends BaseTest {
   // By userManagementMenu = By.xpath("//li//span[text() = 'Admin']");
    //By userTitle = By.xpath("//div/h5[Text() = 'System Users']");

    @Test
    public void clickUserManagementMenu() {
        var userManagementMenuPage = loginPage.clickUserManagementMenu();
        String actual = userManagementMenuPage.getTitle();
        String expected = "System Users";
        Assert.assertEquals(actual, expected, "User Management Menu title does not match expected value.");
        
    }

    @Test
    public void searchUserByUsername() {
        String username = "Admin";
        //var userManagementMenuPage = loginPage.clickUserManagementMenu().clickSearchWithText(username);

        // var userManagementMenuPage = loginPage.clickUserManagementMenu();
        // userManagementMenuPage.clickOnUserRoleDropdown("Admin");
        // WebElement searchButton = userManagementMenuPage.findElement(By.xpath("//div//button[text() = 'Search']"));
        // searchButton.click();
        // String actual = userManagementMenuPage.getTitle();
        // String expected = "System Users";
        // Assert.assertEquals(actual, expected, "Search by username did not return expected results.");
    }

}
