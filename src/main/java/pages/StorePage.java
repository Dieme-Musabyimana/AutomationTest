package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StorePage {
    public WebDriver driver;
    private WebDriverWait wait;
    protected BasicBlueJeansPage basicBlueJeansPage;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    private By Store = By.cssSelector("h1.woocommerce-products-header__title.page-title");
    private By BasicBlueJeans = By.cssSelector("a[href*='basic-blue-jeans']");
    private By sortingDropDown = By.className("orderby");
    private By addToCartButton = By.name("add-to-cart");
    private By darkBrownJeans = By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img");
    private By DenimBlueJeans = By.xpath("//*[@id=\"main\"]/div/ul/li[3]/div[2]/a[1]/h2");

    public String getStorePageHeading() {
        return driver.findElement(Store).getText().trim();
    }

    public BasicBlueJeansPage goToBasicBlueJeansPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement jeans = wait.until(ExpectedConditions.elementToBeClickable(BasicBlueJeans));

        jeans.click();
        return new BasicBlueJeansPage(driver);
    }

    public List<String> getAllDropDowns() {
        WebElement dropDown = driver.findElement(sortingDropDown);
        Select select = new Select(dropDown);
        List<WebElement> allOptions = select.getOptions();
        List<String> allOptionsText = new ArrayList<>();

        for(WebElement option : allOptions){
            allOptionsText.add(option.getText().trim());
        }
        return allOptionsText;

    }
    public void addProductsToCart(){
        driver.findElement(darkBrownJeans).click();
        driver.findElement(addToCartButton).click();
    }
}

