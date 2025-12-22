package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage {
    public AboutPage(WebDriver driver) {
        super(driver);
    }
    private By aboutPageHeading=By.xpath("//*[@id=\"post-59\"]/div/div[1]/div/h1");
    public String getAboutHeadingPage(){
        return driver.findElement(aboutPageHeading).getText().trim();
    }
}
