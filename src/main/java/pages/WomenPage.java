package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage extends BasePage {
    public WomenPage(WebDriver driver){
        super(driver);
    }
    private By womenPageHeading=By.xpath("//*[@id='main']/div/header/h1");
    public String getWomenPageHeading(){
        String heading=driver.findElement(womenPageHeading).getText();
        return heading.trim();
    }
}
