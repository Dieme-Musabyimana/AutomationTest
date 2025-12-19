package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage {
    private WebDriver driver;
    public MenPage(WebDriver driver){
        this.driver=driver;
    }
    private By pageHeading = By.cssSelector("h1.woocommerce-products-header__title.page-title");
    public String getMenPageHeading(){
        return driver.findElement(pageHeading).getText().trim();
    }
}
