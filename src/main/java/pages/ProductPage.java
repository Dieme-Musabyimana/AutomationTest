package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver){

        super(driver);
    }
    private By addToCartButton = By.name("add-to-cart");
    private By successAddAlert = By.cssSelector("div.woocommerce-message");

    public String addProductToCart(){
        driver.findElement(addToCartButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String fullText = wait.until(ExpectedConditions.visibilityOfElementLocated(successAddAlert)).getText();
        return fullText.replace("View To Cart"," ").trim();

    }
}
