package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newspage {
	
	@FindBy(xpath="//input[@name=\"NewsletterEmail\"]")
	public WebElement inputnews;
	
	@FindBy(xpath="//input[@id=\"newsletter-subscribe-button\"]")
	public WebElement subscribe;
	
	@FindBy(css ="#newsletter-result-block")
	public WebElement textaftersubscribe;
	

}
