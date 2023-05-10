package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage2 {
    WebDriver driver;
    private By confirmByEmail = By.xpath("//div[@class='sub-title']//h2");
    public RegisterPage2(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getConfirmByEmailTxt(String text) {
        return driver.findElement(confirmByEmail).getText().contains(text);
    }
}
