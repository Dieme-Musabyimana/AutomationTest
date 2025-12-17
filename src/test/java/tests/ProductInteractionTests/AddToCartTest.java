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
        var expectedMessage = "has been added to your cart.";

        soft.assertTrue(actualResult.contains(expectedMessage),"!!!!!!!!!!Product is not added to cart");
        soft.assertAll();
    }
}
