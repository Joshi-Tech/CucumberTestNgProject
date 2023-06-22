package tests;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static LoginPage loginPage;
    //static HomePage homePage;
    @BeforeTest
    public  void launchWebsite(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();
      homePage =   new HomePage(driver);
      loginPage = new LoginPage(driver);

    }

    @AfterTest
    public  void tearDown(){
       // driver = new ChromeDriver();
        driver.close();
    }
}
