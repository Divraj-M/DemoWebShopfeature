package Actions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.cartpages;
import utilities.HelperClass;
import utilities.exceldata;

public class cartactions {
    cartpages objcart;
    String product1;

    public cartactions() {
        this.objcart = new cartpages();
        PageFactory.initElements(HelperClass.getDriver(), objcart);
    }

    public void readProductFromExcel() throws IOException {
        exceldata excelUtil = new exceldata();
        String[][] data = excelUtil.getExcelData("src/test/resources/exceldataread.xlsx", "Sheet1");
        product1 = data[0][0];
        
    }

    public void searchAndAddToCart() {
        objcart.searchbox.clear();
        objcart.searchbox.sendKeys(product1);
        objcart.search.click();
        objcart.addtocart.click();
    }

    public boolean isProductInCart() {
        return objcart.cart.getText().contains(product1);
    }
    public void clickwishlist() {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(objcart.wishlist)).click();
    }
    public String gettextalbum()
    {
    	return objcart.insidewishlist.getText();
    }
}
