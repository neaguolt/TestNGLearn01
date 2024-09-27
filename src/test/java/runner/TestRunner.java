package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"} // Optional: Plugins for reporting
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
