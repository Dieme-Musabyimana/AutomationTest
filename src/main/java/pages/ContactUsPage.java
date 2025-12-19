package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    private WebDriver driver;
    public ContactUsPage(WebDriver driver){
        this.driver = driver;

    }
    private By ContactUsPageHeading=By.xpath("//*[@id=\"post-60\"]/div/div[1]");
    public String getContactUsPageHeading(){
        return driver.findElement(ContactUsPageHeading).getText().trim();
    }
}
