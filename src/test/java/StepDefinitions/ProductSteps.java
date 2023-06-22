package StepDefinitions;

import io.cucumber.java.en.Then;
import tests.BaseTest;

public class ProductSteps extends BaseTest {
    @Then("hover on  product")
    public void hover_on_product() {
        homePage.supportAndServiceDrpDn();
    }

    @Then("click Features")
    public void click_features() {
        homePage.clickCommunitySupport();
    }

    @Then("get title of the page")
    public void get_title_of_the_page() {
        driver.getTitle();
        System.out.println(driver.getTitle());

    }

    @Then("quit")
    public void quit() {
        driver.quit();
    }
}
