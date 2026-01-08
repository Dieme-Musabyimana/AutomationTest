package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadPage extends BasePage {
    public WebDriverWait wait;
    public DownloadPage(WebDriver driver){
    super(driver);
    }
    private By browseProduct = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/div[2]/a");
    public String browseProduct(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(browseProduct));
        element.click();
        return driver.getCurrentUrl();
    }
}
