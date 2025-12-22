package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver){
    super(driver);
    }
    private By ContactUsPageHeading=By.xpath("//*[@id=\"post-60\"]/div/div[1]");
    public String getContactUsPageHeading(){
        return driver.findElement(ContactUsPageHeading).getText().trim();
    }
}
