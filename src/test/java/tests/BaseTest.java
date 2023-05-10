package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private WebDriver driver;
    @BeforeTest
    public  void launchWebsite(){
        WebDriverManager.chromedriver().setup();
    }

    @AfterTest
    public  void tearDown(){
        //driver = new ChromeDriver();
        driver.close();
    }
}
