package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage extends BasePage {
    public AccessoriesPage(WebDriver driver){
        super(driver);
    }

    private By accessoriesHeading = By.xpath("//*[@id=\"main\"]/div/header/h1");
    public String getAccessoriesHeading(){
        return driver.findElement(accessoriesHeading).getText().trim();
    }
}
