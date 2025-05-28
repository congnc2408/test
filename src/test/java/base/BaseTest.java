package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.orangehrm.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String username = "Admin";
    String password = "admin123";

    @BeforeSuite
    public void setUp() {
       
        
    }

    @BeforeClass
    public void loadApplication() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
        loginPage.setDriver(driver);
       
    }

    @BeforeMethod
    public void loginBeforeTest(){
        driver.get(baseUrl);
        basePage.deLay(2);
        loginPage.login(username, password);
        basePage.deLay(5);
    } 


    @AfterClass
    public void tearDown() {
        BasePage.quit(3);
    }


}
