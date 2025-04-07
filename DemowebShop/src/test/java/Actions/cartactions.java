package Actions;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
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
    public void clickwishlist()
    {
    	objcart.wishlist.click();
    }
    public String gettextalbum()
    {
    	return objcart.insidewishlist.getText();
    }
}
