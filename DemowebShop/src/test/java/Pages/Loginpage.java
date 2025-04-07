package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(xpath="//li//a[text()=\"Log in\"]")
	public WebElement loginhome;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	public WebElement emailid;
	
	@FindBy(xpath="//input[@class=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement loginbtn;
	
	@FindBy(xpath="//span[text()=\"Please enter a valid email address.\"]")
	public WebElement errorLogin;
	
	@FindBy(xpath="//a[@class=\"ico-logout\"]")
	public WebElement logo;
	
	
	

}
