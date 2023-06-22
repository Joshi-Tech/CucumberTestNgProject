package tests;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
    public static void main(String[] args) {
        WebDriverManager webDriverManager;
        webDriverManager = new ChromeDriverManager();
        webDriverManager.setup();
        WebDriver driver;
        driver = new ChromeDriver();
    driver.get("https://www.nopcommerce.com/en/boards/topic/94854/nopcommerce-460-roadmap-discussion");
        new HomePage(driver).supportAndServiceDrpDn();
    }
}
