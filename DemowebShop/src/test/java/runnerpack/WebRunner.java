package runnerpack;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Listeners(utilities.Listenerclass.class)
@CucumberOptions(
    features = {"src/test/resources/feature/login.feature","src/test/resources/feature/Newsletter.feature","src/test/resources/feature/cart.feature"},
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
