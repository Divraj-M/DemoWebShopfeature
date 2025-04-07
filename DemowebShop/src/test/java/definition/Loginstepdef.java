package definition;

import java.util.List;
import org.testng.Assert;
import Actions.loginaction;
import io.cucumber.java.en.*;
import utilities.HelperClass;
public class Loginstepdef {

    loginaction objaction;

    @Given("I am on the DemoWebShop website")
    public void i_am_on_the_demo_web_shop_website() {
        HelperClass.setupDriver();
        HelperClass.openPage("https://demowebshop.tricentis.com/");
        objaction = new loginaction();
    }
    
    
    @When("I click Login and enter valid email and valid password")
    public void i_click_login_and_enter_valid_email_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
        objaction.HomeLogin();
        List<List<String>> data = dataTable.asLists(String.class);
        String email = data.get(0).get(0);
        String password = data.get(0).get(1);
        objaction.setLogin(email, password);
    }

    @Then("user should be entered in the Homepage of the Application")
    public void user_should_be_entered_in_the_homepage_of_the_application() {
        objaction.Clicklogin();
        objaction.log();
    }

    @When("I click Login and enter invalid email and invalid password")
    public void i_click_login_and_enter_invalid_email_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
        objaction.HomeLogin();
        List<List<String>> data = dataTable.asLists(String.class);
        String email = data.get(0).get(0);
        String password = data.get(0).get(1);
        objaction.setLogin(email, password);
    }

    @Then("user should see the error message in the Application")
    public void user_should_see_the_error_message_in_the_application() {
        String actual = objaction.errorloginas();
        String expected = "Please enter a valid email address.";
        Assert.assertEquals(actual, expected);
    }
}
