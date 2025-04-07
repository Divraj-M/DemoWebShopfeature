package Actions;

import org.openqa.selenium.support.PageFactory;
import Pages.Loginpage;
import utilities.HelperClass;

public class loginaction {

    Loginpage loginpage;

    public loginaction() {
        this.loginpage = new Loginpage();
        PageFactory.initElements(HelperClass.getDriver(), loginpage);
    }

    public void HomeLogin() {
        loginpage.loginhome.click();
    }

    public void setLogin(String emailid, String password) {
        loginpage.emailid.sendKeys(emailid);
        loginpage.password.sendKeys(password);
    }

    public void Clicklogin() {
        loginpage.loginbtn.click();
    }

    public String errorloginas() {
        return loginpage.errorLogin.getText();
    }

	public void log() {
		
		loginpage.logo.click();
		
	}
}
