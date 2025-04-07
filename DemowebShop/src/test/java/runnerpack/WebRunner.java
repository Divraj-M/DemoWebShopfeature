package runnerpack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/feature/login.feature",
    glue = "definition",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    }
)
public class WebRunner extends AbstractTestNGCucumberTests {
}
