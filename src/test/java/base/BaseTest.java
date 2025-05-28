package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
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
    public void loadApplication() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
         // options.addArguments("--headless"); // Uncomment for headless mode (no UI)

        // CRITICAL: Specify a unique, temporary user data directory
        // This ensures a clean profile for each run and avoids conflicts
        options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "selenium_edge_profile_" + System.currentTimeMillis());


        // Option 2: Use an ephemeral (in-memory) profile - less persistent
        // options.addArguments("--guest"); // Opens Edge in Guest mode (no profile saved)
        // options.addArguments("--incognito"); // Opens in Incognito mode (also no profile saved)
        driver = new EdgeDriver(options);
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
