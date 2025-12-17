package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private By Home = By.linkText("Home");
    private By Store = By.linkText("Store");
    private By Men = By.linkText("Men");
    private By Women= By.linkText("Women");
    private By Accessories = By.linkText("Accessories");
    private By Account = By.linkText("Account");
    private By About = By.linkText("About");
    private By ContactUs = By.linkText("Contact Us");
    private By cart = By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span");
    private By shopNow = By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a");


    public HomePage goToHome(){
        driver.findElement(Home).click();
        return this;
    }

    public StorePage goToStore(){
        driver.findElement(Store).click();
        return new StorePage(driver);
    }
    public MenPage goToMen(){
        driver.findElement(Men).click();
        return new MenPage(driver);
    }
    public WomenPage goToWomen(){
        driver.findElement(Women).click();
        return new WomenPage(driver);
    }
    public AccessoriesPage goToAccessories(){
        driver.findElement(Accessories).click();
        return new AccessoriesPage(driver);
    }
    public AccountPage goToAccount(){
        driver.findElement(Account).click();
        return new AccountPage(driver);
    }
    public AboutPage goToAbout(){
        driver.findElement(About).click();
        return new AboutPage(driver);
    }
    public ContactUsPage goToContactUs(){
        driver.findElement(ContactUs).click();
        return new ContactUsPage(driver);
    }
    public CartPage goToCart(){
        driver.findElement(cart).click();
        return new CartPage(driver);
    }
    public StorePage gotoShopNow(){
        driver.findElement(shopNow).click();
        return new StorePage(driver);
    }
}
