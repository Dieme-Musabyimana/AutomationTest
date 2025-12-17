package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }
    private By dashboard = By.linkText("Dashboard");
    public String getDashboardMessage(){
        return driver.findElement(dashboard).getText().trim();

    }
}
