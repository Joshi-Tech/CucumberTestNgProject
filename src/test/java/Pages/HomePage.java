package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By signUpIcon = By.xpath("//span//*[name()='svg']");
    private By registerClick = By.xpath("//*[text()='Register']");
    private By login = By.xpath("//*[text()='Log in']");
    //private By supportAndServiceDrpDwn = By.cssSelector(".navigation-top-menu-label navigation-top-menu-label-arrow");
    private By supportAndServiceDrpDwn = By.xpath("//*[text() ='Support & services']");
    private By communitySupport = By.xpath("//*[@href='/en/boards']");


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

    public void supportAndServiceDrpDn(){
        Actions actions = new Actions(driver);
        List<WebElement> elements = driver.findElements(supportAndServiceDrpDwn);
        actions.moveToElement(elements.get(0)).perform();
    }

    public void clickCommunitySupport(){
        List<WebElement> community = driver.findElements(communitySupport);
        community.get(0).click();
    }
}
