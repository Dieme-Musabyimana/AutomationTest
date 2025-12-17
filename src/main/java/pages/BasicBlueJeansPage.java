package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicBlueJeansPage {
    public WebDriver driver;
    public BasicBlueJeansPage(WebDriver driver){
        this.driver = driver;
    }
    private By addToCartButton = By.name("add-to-cart");
    private By successAddAlert = By.cssSelector("div.woocommerce-message");

    public String addProductToCart(){
        driver.findElement(addToCartButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String fullText = wait.until(ExpectedConditions.visibilityOfElementLocated(successAddAlert)).getText();
        return driver.findElement(successAddAlert).getText().replace("View To Cart"," ").trim();

    }
}
