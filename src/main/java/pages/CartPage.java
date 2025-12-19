package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    public WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By cartPageHeading = By.xpath("//*[@id=\"post-1220\"]/div/div/div/h1");
    private By proceedToCheckout = By.cssSelector(".checkout-button.alt.wc-forward");
    private By removeProduct = By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/form/table/tbody/tr[1]/td[1]/a");
    private By alertMessage = By.cssSelector(".woocommerce-message");
    private By quantityAdjustor = By.cssSelector("input[name*='[qty]']");
    private By updateCartButton = By.name("update_cart");
    private By updateAlert = By.cssSelector("div.woocommerce-message");

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
    public String adjustQuantity(int quantity){
        WebElement quantityField = wait.until(ExpectedConditions.visibilityOfElementLocated(quantityAdjustor));
        quantityField.click();
        quantityField.clear();
        quantityField.sendKeys(String.valueOf(quantity));
        wait.until(ExpectedConditions.visibilityOfElementLocated(updateCartButton)).click();
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(updateAlert));
        return alert.getText();
    }
}
