package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddressPage {
    private WebDriver driver;
    public WebDriverWait wait;
    public AddressPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By editBillingAddressOption = By.linkText("Edit");

    public EditBillingAddressPage goToEditBillingAddressPage(){
        wait.until(ExpectedConditions.elementToBeClickable(editBillingAddressOption)).click();
        return  new EditBillingAddressPage(driver);
    }


}
