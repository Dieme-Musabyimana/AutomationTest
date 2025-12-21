package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditBillingAddressPage {
    private WebDriver driver;
    public EditBillingAddressPage(WebDriver driver){
        this.driver = driver;
    }
    private By emailField = By.id("billing_email");
    private By saveAddressButton = By.name("save_address");
    private By successAlert = By.cssSelector("div.woocommerce-message[role='alert']");


    public String editBillingAddress(String email){
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(saveAddressButton).click();
       return driver.findElement(successAlert).getText();
    }


}
