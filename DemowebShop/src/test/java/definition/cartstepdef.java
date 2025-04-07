package definition;

import org.testng.Assert;

import Actions.cartactions;
import Pages.cartpages;
import io.cucumber.java.en.*;
import utilities.HelperClass;

public class cartstepdef {
    cartactions obj2;

    @Given("I am on the demowebshop application")
    public void i_am_on_the_demowebshop_application() throws Exception {
        HelperClass.setupDriver();
        HelperClass.openPage("https://demowebshop.tricentis.com/");
        obj2 = new cartactions();
        obj2.readProductFromExcel();
    }

    @When("I click the search store field")
    public void i_click_the_search_store_field() {
        obj2.searchAndAddToCart();
    }

    @When("click add to cart button")
    public void click_add_to_cart_button(){
    	obj2.isProductInCart();
    }

    @Then("User should see the product in the wishlist")
    public void user_should_see_the_product_in_the_wishlist() {
    	obj2.clickwishlist();
    	String act="3rd Album";
    	String exp=obj2.gettextalbum();
    	Assert.assertEquals(act,exp);
    	
    	
    	
    }

	
}
