package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    public WebDriver driver;
    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    private By AccountPageHeading = By.xpath("//*[@id=\"post-1235\"]/div/div[1]/div/h1");
    private By dashboardText = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/p[2]");

    public String getAccountHeadingPage(){
        return driver.findElement(AccountPageHeading).getText();
    }



    private By usernameRegField = By.id("reg_username");
    private By emailRegField = By.id("reg_email");
    private By passwordRegField = By.id("reg_password");
    private By registerButton = By.name("register");
    private By errorMessage = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div[1]/ul/li");


    private By UsernameLoginField = By.id("username");
    private By asswordLoginField = By.id("password");
    private By loginButton = By.name("login");
    private By rememberMeBox= By.id("rememberme");

    public DashboardPage setValidCredentials(String validUsername, String validEmail, String validPassword){
        driver.findElement(usernameRegField).sendKeys(validUsername);
        driver.findElement(emailRegField).sendKeys(validEmail);
        driver.findElement(passwordRegField).sendKeys(validPassword);
        driver.findElement(registerButton).click();
 return new DashboardPage(driver);
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText().trim();
    }
}

