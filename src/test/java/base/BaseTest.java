package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class BaseTest {
    public WebDriver driver;
    protected HomePage homePage;
    public SoftAssert soft;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        homePage = new HomePage(driver);
        soft = new SoftAssert();
    }

    @AfterMethod

    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}


