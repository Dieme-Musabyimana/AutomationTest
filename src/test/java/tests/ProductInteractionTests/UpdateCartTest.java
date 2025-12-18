package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.StorePage;

public class UpdateCartTest extends BaseTest {

@Test
    public void testUpdateCart(){
    StorePage store = homePage.goToStore();
    store.goToBasicBlueJeansPage().addProductToCart();
    CartPage cart = homePage.goToCart();
    String actualResult = cart.adjustQuantity(3);
    String expectedAlert = "updated";
    soft.assertTrue(actualResult.contains(expectedAlert),"!!!!!!!Cart is not updated");
    soft.assertAll();
}
}
