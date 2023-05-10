package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import tests.BaseTest;

public class LoginSteps extends BaseTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @Given("Given user launches website {string}")
    public void given_user_launches_website(String url) {
        launchWebsite();
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Then("click login option")
    public void click_login_option() {
        homePage = new HomePage(driver);
        homePage.clickSignUpIcon();
        homePage.clickLogin();
    }

    @Then("Get login page title")
    public void get_login_page_title() {
        loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.getPageTitle(), "Welcome, Please Sign In!",
                "Title doesn't match");
    }

    @Then("Get login form title")
    public void get_login_form_title() {
        Assert.assertEquals(loginPage.getLoginFormTitle(), "Returning Customer",
                "Login Form title doesn't match");
    }

    @Then("Enter user name {string}")
    public void enter_user_name(String userName) {
        loginPage.userNameTxtBx(userName);
    }

    @Then("Enter password {string}")
    public void enter_password(String password) {
        loginPage.setPassword(password);
    }

    @Then("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("close browser")
    public void closeBrowser() {
        tearDown();
    }
}
