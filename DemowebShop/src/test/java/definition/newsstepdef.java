package definition;

import java.util.List;

import org.testng.Assert;

import Actions.loginaction;
import Actions.newsaction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.HelperClass;

public class newsstepdef {
	newsaction obj;
@Given("I am on the DemoWebShop website page")
public void i_am_on_the_demo_web_shop_website_page() {
	HelperClass.setupDriver();
    HelperClass.openPage("https://demowebshop.tricentis.com/");
    obj= new newsaction();
}

@When("user enter the valid email id to the newsletter")
public void user_enter_the_valid_email_id_to_the_newsletter(io.cucumber.datatable.DataTable dataTable) 
{
	List<List<String>> data1 = dataTable.asLists(String.class);
    String emailnews = data1.get(0).get(0);
    obj.setemailnews(emailnews);
    obj.clicksubscribe();
    
    
}

@Then("user should see the Thank you message")
public void user_should_see_the_thank_you_message() {
	String act="Thank you for signing up! A verification email has been sent. We appreciate your interest.";
	System.out.println("act:"+act);
	System.out.println("exp:"+obj.getstringofnews());
	String exp=obj.getstringofnews();
	Assert.assertEquals(act, exp);
	
    
}

@When("user enter the invalid email id to the newsletter")
public void user_enter_the_invalid_email_id_to_the_newsletter(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> data = dataTable.asLists(String.class);
    String emailnews = data.get(0).get(0);
    obj.setemailnews(emailnews);
    obj.clicksubscribe();
}

@Then("user should see the message as enter valid email")
public void user_should_see_the_message_as_enter_valid_email() {
	String act1="Enter valid email";
	System.out.println("act:"+act1);
	System.out.println("exp:"+obj.getstringofnews());
	String exp=obj.getstringofnews();
	Assert.assertEquals(act1, exp);
	
    
}


}
