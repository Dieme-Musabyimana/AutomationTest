package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StorePage {
    private WebDriver driver;
    private WebDriverWait wait;
    protected ProductPage basicBlueJeansPage;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    private By Store = By.cssSelector("h1.woocommerce-products-header__title.page-title");
    private By BasicBlueJeans = By.cssSelector("a[href*='basic-blue-jeans']");
    private By sortingDropDown = By.className("orderby");
    private By addToCartButton = By.name("add-to-cart");
    private By darkBrownJeans = By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img");

    private By priceSlider = By.cssSelector(".price_slider");
    private By leftHandle = By.cssSelector(".price_slider span:nth-of-type(1)");
    private By rightHandle = By.cssSelector(".price_slider span:nth-of-type(2)");
    private By filterButton = By.cssSelector("button.button[type='submit']");
    public String getStorePageHeading() {
        return driver.findElement(Store).getText().trim();
    }

    public ProductPage goToBasicBlueJeansPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement jeans = wait.until(ExpectedConditions.elementToBeClickable(BasicBlueJeans));

        jeans.click();
        return new ProductPage(driver);
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
    public void filterByPriceRange(int targetMin, int targetMax) {
        WebElement slider = wait.until(ExpectedConditions.presenceOfElementLocated(priceSlider));
        WebElement left = driver.findElement(leftHandle);
        WebElement right = driver.findElement(rightHandle);

        int width = slider.getSize().getWidth();
        double totalRange = 150 - 10;
        double pixelPerDollar = width / totalRange;

        int moveLeft = (int) ((targetMin - 10) * pixelPerDollar);
        int moveRight = (int) ((targetMax - 150) * pixelPerDollar);

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(left, moveLeft, 0).build().perform();
        actions.dragAndDropBy(right, moveRight, 0).build().perform();

        driver.findElement(filterButton).click();
    }
}

