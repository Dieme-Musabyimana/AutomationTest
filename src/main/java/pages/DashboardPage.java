package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver){
        super(driver);
    }
    private By dashboard = By.linkText("Dashboard");
    public String getDashboardMessage(){
        return driver.findElement(dashboard).getText().trim();

    }
}
