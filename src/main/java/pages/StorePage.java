package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class StorePage {
    public WebDriver driver;
    protected BasicBlueJeansPage basicBlueJeansPage;

    public StorePage(WebDriver driver) {
        this.driver = driver;
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
        driver.findElement(BasicBlueJeans).click();
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

