package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DownloadPage {
    private WebDriver driver;
    public WebDriverWait wait;
    public DownloadPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By browseProduct = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/div[2]/a");
    public String browseProduct(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(browseProduct));
        element.click();
        return driver.getCurrentUrl();
    }
}
