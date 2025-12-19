package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {
    private WebDriver driver;
    public AccessoriesPage(WebDriver driver){
        this.driver = driver;
    }
    private By accessoriesHeading = By.xpath("//*[@id=\"main\"]/div/header/h1");
    public String getAccessoriesHeading(){
        return driver.findElement(accessoriesHeading).getText().trim();
    }
}
