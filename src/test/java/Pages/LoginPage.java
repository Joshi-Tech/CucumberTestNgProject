package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   private WebDriver driver;

   private By userName = By.xpath("//*[@id='Username']");
   private By password = By.xpath("//*[@id='Password']");
    private By loginBtn = By.xpath("//*[@type='submit']");
    private By pageTitle = By.xpath("//*[@class='page-title']/h1");
    private By loginFormTitle = By.xpath("//strong[text()='Returning Customer']");


    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    public String getPageTitle(){
        return driver.findElement(pageTitle).getText().trim();
    }

    public String getLoginFormTitle(){
        return driver.findElement(loginFormTitle).getText().trim();
    }

    public void userNameTxtBx(String uName){
        driver.findElement(userName).sendKeys(uName);
    }

    public void setPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }


}
