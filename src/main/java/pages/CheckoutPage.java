package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    public WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    private By firstNameField = By.id("billing_first_name");
    private By lastNameField = By.id("billing_last_name");
    private By countryDropDown = By.id("billing_country");

    private By street = By.id("billing_address_1");
    private By town = By.id("billing_city");
    private By state = By.id("select2-billing_state-container");
    private By zipCode = By.id("billing_postcode");
    private By email = By.id("billing_email");
    private By paymentMethod = By.id("payment_method_cod");
    private By placeOrderButton = By.id("place_order");
    private By successMessage = By.xpath("//*[@id=\"post-1221\"]/div/div/div/div/div/p[1]");

    private void fillCheckoutForm(String firstName,
                                  String lastName,
                                  String city,
                                  String zipcode,
                                  String Email
                                  ){
 driver.findElement(firstNameField).sendKeys(firstName);
 driver.findElement(lastNameField).sendKeys(lastName);
 driver.findElement(town).sendKeys(city);
 driver.findElement(state).sendKeys(city);
 driver.findElement(zipCode).sendKeys(zipcode);
 driver.findElement(email).sendKeys(Email);

    }
    public void selectCountry(String country){
       Select select = new Select(driver.findElement(countryDropDown));
       select.selectByVisibleText(country);

    }
}
