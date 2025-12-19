package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    private WebDriver driver;
    public AboutPage(WebDriver driver){
        this.driver = driver;
    }
    private By aboutPageHeading=By.xpath("//*[@id=\"post-59\"]/div/div[1]/div/h1");
    public String getAboutHeadingPage(){
        return driver.findElement(aboutPageHeading).getText().trim();
    }
}
