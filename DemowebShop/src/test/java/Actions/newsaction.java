package Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.Loginpage;
import Pages.newspage;
import utilities.HelperClass;

public class newsaction {
	newspage obj1;
	public newsaction() {
        this.obj1 = new newspage();
        PageFactory.initElements(HelperClass.getDriver(), obj1);
    }

	public void setemailnews(String emailnews) {
		obj1.inputnews.sendKeys(emailnews);
		
	}
	
	public void clicksubscribe()
	{
		obj1.subscribe.click();
	}
	public String getstringofnews()
	{
		return obj1.textaftersubscribe.getText();
	}
	

}
