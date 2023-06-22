package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/firstCucumber.feature"},
        glue = {"StepDefinitions"},
        dryRun = false,
        monochrome = false,
        //tags = "@regression",
        plugin = {"pretty", "html:testReport"}

)
public class FirstRun extends AbstractTestNGCucumberTests {
}
