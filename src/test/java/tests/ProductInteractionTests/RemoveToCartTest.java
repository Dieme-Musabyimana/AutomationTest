package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.StorePage;

public class RemoveToCartTest extends BaseTest {
    @Test
    public void removeToCartTest(){
     StorePage store = homePage.goToStore();
        store.goToBasicBlueJeansPage().addProductToCart();
     CartPage cart = homePage.goToCart();
     var actualResult = cart.removeProductFromCart();
     var expectedMessage = "removed";
     soft.assertTrue(actualResult.contains(expectedMessage),"!!!!!!Product is not removed from cart");
     soft.assertAll();
    }
}
