package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class AddToCartTest extends BaseTest {
    @Test
    public void addToCartTest(){
        StorePage store = new StorePage(driver);
        var basicBlueJeansPage=store.goToBasicBlueJeansPage();
        var actualResult =basicBlueJeansPage.addProductToCart();
        var expectedResult = " “Basic Blue Jeans” has been added to your cart.";

        soft.assertEquals(actualResult,expectedResult,"Product not added to cart.");
        soft.assertAll();
    }
}
