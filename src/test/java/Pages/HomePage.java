package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By signUpIcon = By.xpath("//span//*[name()='svg']");
    private By registerClick = By.xpath("//*[text()='Register']");
    private By login = By.xpath("//*[text()='Log in']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpIcon() {
        driver.findElement(signUpIcon).click();
    }

    public void clickRegister() {
        driver.findElement(registerClick).click();
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }
}
