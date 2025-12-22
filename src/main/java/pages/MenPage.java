package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage extends BasePage {
    public MenPage(WebDriver driver){
        super(driver);
    }
    private By pageHeading = By.cssSelector("h1.woocommerce-products-header__title.page-title");
    public String getMenPageHeading(){
        return driver.findElement(pageHeading).getText().trim();
    }
}
