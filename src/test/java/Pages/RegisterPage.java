package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage {
    private WebDriver driver;
    private By registerTitle = By.xpath("//h1[text()='Register']");
    private By formTitle = By.xpath("//strong[text()='Your Personal Details']");
    private By firstName = By.xpath("//input[@id='FirstName']");
    private By lastName = By.xpath("//input[@id='LastName']");
    private By email = By.xpath("//input[@id='Email']");
    private By confirmEmail = By.xpath("//input[@id='ConfirmEmail']");
    private By userName = By.xpath("//input[@id='Username']");
    private By checkAvailabilityBtn = By.xpath("//*[@id='check-availability-button']");
    private By chooseCountry = By.xpath("//option[text()='United States']");
    private By countryDrpDwn = By.xpath("//select[@id='CountryId']");
    private By countryName = By.xpath("//*[option='Select country']//option");
    private By timeZoneDrpDwn = By.xpath("//select[@id='TimeZoneId']");
    private By chooseTimeZone = By.xpath("//select[@id='TimeZoneId']/option");
    private By pwdFormTitle = By.xpath("//strong[contains(text(),'Your Password')]");
    private By pwdTxtBx = By.xpath("//*[@id='Password']");
    private By confirmPwdTxtBx = By.xpath("//*[@id='ConfirmPassword']");
    private By yourAccountsDrpDwn = By.xpath("//strong[contains(text(),'Your Account Details)]");
    private By myCompanyDrpDwn = By.xpath("//select[@id='Details_CompanyIndustryId']");
    private By myCompanyOption = By.xpath("//select[@id='Details_CompanyIndustryId']/option");
    private By useNopUseDropDown = By.xpath("//select[@id='Details_NopCommerceIntendedUseId']");
    private By useNopUseOption = By.xpath("//select[@id='Details_NopCommerceIntendedUseId']/option");
    private By myRoleDrpDwn = By.xpath("//select[@id='Details_CompanyRoleId']");
    private By myRoleOption = By.xpath("//select[@id='Details_CompanyRoleId']/option");
    private By companySizeDrpDwn = By.xpath("//select[@id='Details_CompanySizeId']");
    private By howManyWorkersOption = By.xpath("//select[@id='Details_CompanySizeId']/option");
    private By userNameAvailableTxt = By.xpath("//span[@id='username-availabilty']");
    private By registrationMsgError = By.xpath("//div[contains(@class,'message-error')]");
    private By registerBtn = By.xpath("//input[@id='register-button']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getRegisterTitle() {
        return driver.findElement(registerTitle).getText();
    }

    public String getFormTitle() {
        return driver.findElement(formTitle).getText();
    }

    public void getFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void getLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void getEmail(String emailAdd) {
        driver.findElement(email).sendKeys(emailAdd);
    }

    public void getConfirmEmail(String confirmEmailA) {
        driver.findElement(confirmEmail).sendKeys(confirmEmailA);
    }

    public void getUserName(String uName) {
        driver.findElement(userName).sendKeys(uName);
    }

    public void checkAvailability() {
        driver.findElement(checkAvailabilityBtn).click();
    }

    public boolean userNameAvailable() {
        System.out.println(driver.findElement(userNameAvailableTxt).getText());
        return driver.findElement(userNameAvailableTxt).getText().contains("userName");
    }
    public void clickCountryDrpDown() {

        driver.findElement(countryDrpDwn).click();
    }
    public void selectCountryFromDropDown(String countryNam) {
        List<WebElement> country = driver.findElements(countryName);
        for (int i = 0; i < country.size(); i++) {
            if (country.get(i).getText().equals(countryNam)) {
                country.get(i).click();
                break;
            }
        }
    }

    public void clickTimeZoneDrpDwn() {
        driver.findElement(timeZoneDrpDwn).click();
    }

    public void selectTimeZone(String timeZone) {
        List<WebElement> zone = driver.findElements(chooseTimeZone);
        for (int i = 0; i < zone.size(); i++) {
            if (zone.get(i).getText().equals(timeZone)) {
                zone.get(i).click();
            }
        }
    }

    public String getPwdFormTitle() {
        return driver.findElement(pwdFormTitle).getText();
    }

    public void typePassword(String pwd) {
        driver.findElement(pwdTxtBx).sendKeys(pwd);
    }

    public void confirmPassword(String pwd) {
        driver.findElement(confirmPwdTxtBx).sendKeys(pwd);
    }

    public void clickYourAccountDropDown() {
        driver.findElement(yourAccountsDrpDwn).click();
    }

    public void clickMyCompanyDropDown() {
        driver.findElement(myCompanyDrpDwn).click();
    }

    public void selectMyCompanyOption(String company) {
        List<WebElement> myCompany = driver.findElements(myCompanyOption);
        for (int i = 0; i < myCompany.size(); i++) {
            if (myCompany.get(i).getText().equals(company)) {
                myCompany.get(i).click();
            }
        }
    }

    public void clickNopUseDropDown() {
        driver.findElement(useNopUseDropDown).click();
    }

    public void selectNopUseOption(String use) {
        List<WebElement> nopUse = driver.findElements(useNopUseOption);
        for (int i = 0; i < nopUse.size(); i++) {
            if (nopUse.get(i).getText().equals(use)) {
                nopUse.get(i).click();
            }
        }
    }

    public void clickMyRoleDrpDown() {
        driver.findElement(myRoleDrpDwn).click();
    }

    public void selectMyRoleOption(String role) {
        List<WebElement> myRole = driver.findElements(myRoleOption);
        for (int i = 0; i < myRole.size(); i++) {
            if (myRole.get(i).getText().equals(role)) {
                myRole.get(i).click();
            }
        }
    }

    public void clickCompanySizeDrpDwn() {
        driver.findElement(companySizeDrpDwn).click();
    }

    public void selectHowManyWorkersOption(String workers) {
        List<WebElement> numberOfWorkers = driver.findElements(howManyWorkersOption);
        for (int i = 0; i < numberOfWorkers.size(); i++) {
            if (numberOfWorkers.get(i).getText().equals(workers)) {
                numberOfWorkers.get(i).click();
            }
        }
    }

    public void clickRegisterBtn() {
        driver.findElement(registerBtn).click();
    }

    public String registrationMsgError() {
        return driver.findElement(registrationMsgError).getText().trim();
    }
}
