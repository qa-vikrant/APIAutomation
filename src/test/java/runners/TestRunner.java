package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/APIAutomation.feature",
        glue = "stepdefinitions",
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
