package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver){
        super(driver);
    }
    private By AccountPageHeading = By.xpath("//*[@id=\"post-1235\"]/div/div[1]/div/h1");

    public String getAccountHeadingPage(){
        return driver.findElement(AccountPageHeading).getText();
    }

    private By usernameRegField = By.id("reg_username");
    private By emailRegField = By.id("reg_email");
    private By passwordRegField = By.id("reg_password");
    private By registerButton = By.name("register");
    private By errorMessage = By.cssSelector(".woocommerce-error");

    private By usernameLoginField = By.id("username");
    private By passwordLoginField = By.id("password");
    private By loginButton = By.name("login");
    private By rememberMeBox= By.id("rememberme");

    private By orderLink = By.linkText("Orders");
    private By DownloadsLink = By.linkText("Downloads");
    private By AddresseLink = By.linkText("Addresses");
    private By AccountDetails = By.linkText("Account details");
    private By logoutLink = By.linkText("Logout");

    public DashboardPage setValidCredentials(String validUsername, String validEmail, String validPassword){
        driver.findElement(usernameRegField).sendKeys(validUsername);
        driver.findElement(emailRegField).sendKeys(validEmail);
        driver.findElement(passwordRegField).sendKeys(validPassword);
        driver.findElement(registerButton).click();
 return new DashboardPage(driver);
    }
    public String getErrorMessage(){
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return error.getText().trim();
    }
    public DashboardPage login (String username, String password){
        driver.findElement(usernameLoginField).sendKeys(username);
        driver.findElement(passwordLoginField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
    public ViewOrdersPage goToOrder(){
        driver.findElement(orderLink).click();
        return new ViewOrdersPage(driver);
    }
    public DownloadPage goToDownloads() {
        driver.findElement(DownloadsLink).click();
        return new DownloadPage(driver);
    }
        public AddressPage goToAddress(){
        driver.findElement(AddresseLink).click();
        return new AddressPage(driver);
    }
    public AccountDetailsPage goToAccountDetail(){
        driver.findElement(AccountDetails).click();
        return new AccountDetailsPage(driver);
    }
    public AccountPage logout(){
        driver.findElement(logoutLink).click();
        return new AccountPage(driver);
    }
}

