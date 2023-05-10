package StepDefinitions;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.RegisterPage2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import tests.BaseTest;

public class SignupSteps extends BaseTest {
    private WebDriver driver;
    private HomePage homePage;
    private RegisterPage registerPage;
    private RegisterPage2 registerPage2;

    @Given("user launches website {string}")
    public void user_launches_website(String url) {
        launchWebsite();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Then("^clicks on signup button$")
    public void clicks_on_signup_button() {
        homePage = new HomePage(driver);
        homePage.clickSignUpIcon();
    }

    @Then("click register")
    public void click_register() {
        homePage.clickRegister();
    }

    @Then("register page opens")
    public void registerPageOpens() {
        registerPage = new RegisterPage(driver);
        Assert.assertEquals(registerPage.getRegisterTitle(), "Register", "Title doesn't match");
    }

    @Then("get tile of registration form")
    public void getTileOfRegistrationForm() {
        Assert.assertEquals(registerPage.getRegisterTitle(), "Register", "Title doesn't match");
    }

    @Then("get personal details title")
    public void getPersonalDetailsTitle() {
        Assert.assertEquals(registerPage.getFormTitle(), "Your Personal Details", "Title doesn't match");
    }

    @Then("type first name {string}")
    public void typeFirstName(String firstName) {
        registerPage.getFirstName(firstName);
    }

    @Then("type last name {string}")
    public void typeLastName(String lastName) {
        registerPage.getLastName(lastName);
    }

    @Then("type email {string}")
    public void typeEmail(String email) {
        registerPage.getEmail(email);
    }

    @Then("confirm email {string}")
    public void confirmEmail(String email) {
        registerPage.getConfirmEmail(email);
    }

    @And("type user name {string}")
    public void typeUserName(String userName) {
        registerPage.getUserName(userName);
    }

    @Then("check availability")
    public void checkAvailability() {
        registerPage.checkAvailability();
    }

    @And("verify user name available")
    public void verifyUserNameAvailable() {
        Assert.assertTrue(registerPage.userNameAvailable(), "Username text is not there");
    }

    @Given("when user has inserted user name")
    public void whenUserHasInsertedUserName() {
    }

    @Then("click country drop down")
    public void clickCountryDropDown() {
        registerPage.clickCountryDrpDown();
    }

    @Then("select country name {string}")
    public void selectCountryName(String country) {
        registerPage.selectCountryFromDropDown(country);
    }

    @And("Click time zone drop down")
    public void clickTimeZoneDropDown() {
        registerPage.clickTimeZoneDrpDwn();
    }

    @Then("Select time zone {string}")
    public void selectTimeZone(String timeZone) {
        registerPage.selectTimeZone(timeZone);
    }

    @Then("get title of password form")
    public void getTitleOfPasswordForm() {
        Assert.assertEquals(registerPage.getPwdFormTitle(), "Your Password", "Title doesn't match");
    }

    @Then("type password {string}")
    public void typePassword(String password) {
        registerPage.typePassword(password);
    }

    @And("confirm password {string}")
    public void confirmPassword(String password) {
        registerPage.confirmPassword(password);
    }

    @Then("click my company primarily drop down")
    public void clickMyCompanyPrimarilyDropDown() {
        registerPage.clickMyCompanyDropDown();
    }

    @Then("select one option from my company primarily {string}")
    public void selectOneOptionFromMyCompanyPrimarily(String company) {
        registerPage.selectMyCompanyOption(company);
    }

    @Then("click intention to use nopCommerce")
    public void clickIntentionToUseNopCommerce() {
        registerPage.clickNopUseDropDown();
    }

    @Then("select intention to use nopCommerce {string}")
    public void selectIntentionToUseNopCommerce(String use) {
        registerPage.selectNopUseOption(use);
    }

    @Then("click my main activity in the company drop down")
    public void clickMyMainActivityInTheCompanyDropDown() {
        registerPage.clickMyRoleDrpDown();
    }

    @Then("select my role option {string}")
    public void selectMyRoleOption(String role) {
        registerPage.selectMyRoleOption(role);
    }

    @Then("click how many people work for the company")
    public void clickHowManyPeopleWorkForTheCompany() {
        registerPage.clickCompanySizeDrpDwn();
    }

    @Then("select one of the company size option {string}")
    public void selectOneOfTheCompanySizeOption(String size) {
        registerPage.selectHowManyWorkersOption(size);
    }

    @And("click register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterBtn();
    }

    @Then("registration second page opens which has text {string}")
    public void registrationSecondPageOpensWhichHasText(String text) {
        registerPage2 = new RegisterPage2(driver);
        if (registerPage2.getConfirmByEmailTxt(text)) {
            Assert.assertEquals(registerPage2.getConfirmByEmailTxt(text), "Almost done!");
        } else {
            Assert.assertTrue(registerPage.registrationMsgError().contains("The specified email already exists"),
                    "Msg doesn't match");
        }
    }

    @Then("tear down browser")
    public void tearDownBrowser() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        tearDown();
    }

    /*@Then("close browser")
    public void closeBrowser(){
        driver.quit();;
    }*/
}
