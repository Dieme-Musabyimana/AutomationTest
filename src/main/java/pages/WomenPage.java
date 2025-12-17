package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage {
    public WebDriver driver;
    public WomenPage(WebDriver driver){
        this.driver = driver;
    }
    private By WomenPageHeading=By.xpath("//*[@id='main']/div/header/h1");
    public String getWomenPageHeading(){
        String heading=driver.findElement(WomenPageHeading).getText();
        return heading.trim();
    }
}
