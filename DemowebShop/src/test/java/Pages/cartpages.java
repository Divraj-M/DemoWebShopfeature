package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartpages {
	@FindBy(xpath="//input[@class=\"search-box-text ui-autocomplete-input\"]")
	public WebElement searchbox;
	
	@FindBy(xpath="//input[@class=\"button-1 search-box-button\"]")
	public WebElement search;
	
	@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement addtocart;
	
	@FindBy(id="bar-notification")
	public WebElement notificationBar;

	@FindBy(xpath="//a[@class=\"ico-cart\"]")
	public WebElement wishlist;
	
	@FindBy(xpath = "//span[@class='cart-qty']")
	public WebElement cart;

	@FindBy(xpath="//a[@class=\"product-name\"]")
	public WebElement insidewishlist;
	

}
