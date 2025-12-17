package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    private By cartPageHeading = By.xpath("//*[@id=\"post-1220\"]/div/div/div/h1");
    private By addedItem = By.linkText("Denim Blue Jeans");
    private By proceedToCheckout = By.cssSelector("a[class=\"checkout-button button alt wc-forward\"]");

    public String getCartPageHeading(){
        return driver.findElement(cartPageHeading).getText().trim();
    }
    public CheckoutPage proceedToCheckout(){
        driver.findElement(proceedToCheckout).click();
        return new CheckoutPage(driver);
    }

}