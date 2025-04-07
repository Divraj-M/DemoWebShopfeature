package runnerpack;

import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(utilities.Listenerclass.class)
@CucumberOptions(
    features = {
        "src/test/resources/feature/login.feature",
        "src/test/resources/feature/Newsletter.feature",
        "src/test/resources/feature/cart.feature"
    },
    glue = "definition",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",                              // Simple HTML
        "json:target/cucumber-reports.json",                              // Required for Masterthought
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,
        "html:target/overview-features.html"
// ExtentReports
    }
)
public class WebRunner extends AbstractTestNGCucumberTests {
}
