package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewOrdersPage {
    private WebDriver driver;
    public WebDriverWait wait;
    public ViewOrdersPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    private By viewOrderBtn = By.cssSelector("a.woocommerce-button.button.view");

    public String ClickViewBtn(){
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(viewOrderBtn));
        view.click();
        return driver.getCurrentUrl();

    }
}
