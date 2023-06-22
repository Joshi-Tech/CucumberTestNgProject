package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import tests.BaseTest;

public class LoginSteps extends BaseTest {
    @Given("Given user launches website {string}")
    public void given_user_launches_website(String url) {
        launchWebsite();
    }

    @Then("click login option")
    public void click_login_option() {
        homePage.clickSignUpIcon();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
