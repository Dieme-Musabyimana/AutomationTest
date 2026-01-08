package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver){
    super(driver);
      }
    private By editBillingAddressOption = By.linkText("Edit");

    public EditBillingAddressPage goToEditBillingAddressPage(){
        wait.until(ExpectedConditions.elementToBeClickable(editBillingAddressOption)).click();
        return  new EditBillingAddressPage(driver);
    }


}
