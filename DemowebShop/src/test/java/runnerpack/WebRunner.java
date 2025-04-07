//package runnerpack;
//
//import org.testng.annotations.Listeners;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@Listeners(utilities.Listenerclass.class)
//@CucumberOptions(
//    features = {
//        "src/test/resources/feature/login.feature",
//        "src/test/resources/feature/Newsletter.feature",
//        "src/test/resources/feature/cart.feature"
//    },
//    glue = "definition",
//    plugin = {
//        "pretty",
//        "html:target/cucumber-reports.html",
//        "json:target/cucumber-reports.json",
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//    }
//)
//public class WebRunner extends AbstractTestNGCucumberTests {
//}

package runnerpack;

import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// Optional: Attach your custom TestNG listener (for logs/screenshots/etc)
@Listeners(utilities.Listenerclass.class)

@CucumberOptions(
    features = {
        "src/test/resources/feature/login.feature",
        "src/test/resources/feature/Newsletter.feature",
        "src/test/resources/feature/cart.feature"
    },
    glue = "definition",  // Package where your step defs are
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",                            // Basic HTML report
        "json:target/cucumber-reports.json",                            // Required for Masterthought report
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // ExtentReports
    }          // Optional: disable Cucumber Cloud publish
)
public class WebRunner extends AbstractTestNGCucumberTests {
}

