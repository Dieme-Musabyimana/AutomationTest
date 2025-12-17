package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {
    public WebDriver driver;
    public AccessoriesPage(WebDriver driver){
        this.driver = driver;
    }
    private By AccessoriesHeading = By.xpath("//*[@id=\"main\"]/div/header/h1");
    public String getAccessoriesHeading(){
        return driver.findElement(AccessoriesHeading).getText().trim();
    }
}
