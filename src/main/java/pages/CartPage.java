package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By cartPageHeading = By.xpath("//*[@id=\"post-1220\"]/div/div/div/h1");
    private By addedItem = By.linkText("Denim Blue Jeans");
    private By proceedToCheckout = By.cssSelector(".checkout-button.alt.wc-forward");
    private By removeProduct = By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/form/table/tbody/tr[1]/td[1]/a");
    private By alertMessage = By.cssSelector(".woocommerce-message");

    public String getCartPageHeading() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartPageHeading)).getText().trim();
    }

    public CheckoutPage proceedToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();
        return new CheckoutPage(driver);
    }

    public String removeProductFromCart() {
        wait.until(ExpectedConditions.elementToBeClickable(removeProduct)).click();
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(alertMessage));
return successMessage.getText().trim();
    }
}
