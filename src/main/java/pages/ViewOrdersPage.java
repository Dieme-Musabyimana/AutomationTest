package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewOrdersPage extends BasePage {
    public WebDriverWait wait;
    public ViewOrdersPage(WebDriver driver){
        super(driver);
    }
    private By viewOrderBtn = By.cssSelector("a.woocommerce-button.button.view");

    public String ClickViewBtn(){
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(viewOrderBtn));
        view.click();
        return driver.getCurrentUrl();

    }
}
