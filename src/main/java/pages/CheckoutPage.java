package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private final WebDriverWait wait;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    private By firstNameField = By.id("billing_first_name");
    private By lastNameField = By.id("billing_last_name");
    private By countryDropDown = By.id("billing_country");

    private By street = By.id("billing_address_1");
    private By town = By.id("billing_city");
    private By stateDropDown = By.id("billing_state");
    private By zipCode = By.id("billing_postcode");
    private By email = By.id("billing_email");
    private By paymentMethod = By.id("payment_method_cod");
    private By placeOrderButton = By.id("place_order");
    private By successMessage = By.cssSelector(".woocommerce-notice--success");
    private By orderNotes = By.id("order_comments");

    public void fillCheckoutForm(String firstName,
                                  String lastName,
                                  String address,
                                  String city,
                                  String zipcode,
                                  String emailAddress,
                                 String OrderNotes
    ) {

        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(street).sendKeys(address);
        driver.findElement(town).sendKeys(city);
        driver.findElement(orderNotes).sendKeys(OrderNotes);



        driver.findElement(zipCode).sendKeys(zipcode);
        driver.findElement(email).sendKeys(emailAddress);
    }
    public void selectCountry(String country){
        wait.until(ExpectedConditions.presenceOfElementLocated(countryDropDown));
       Select select = new Select(driver.findElement(countryDropDown));
       select.selectByVisibleText(country);
    }
    public void selectState(String state){
        wait.until(ExpectedConditions.presenceOfElementLocated(stateDropDown));
        Select select = new Select(driver.findElement(stateDropDown));
        select.selectByVisibleText(state);
    }
    public void placeOrder(){
        driver.findElement(paymentMethod).click();
       driver.findElement(placeOrderButton).click();
        WebElement success = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        success.getText().trim();


    }
}
