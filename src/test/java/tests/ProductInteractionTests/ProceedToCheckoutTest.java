package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

public class ProceedToCheckoutTest extends BaseTest {
    @Test
    public void addtoCartTest(){
        StorePage store = homePage.goToStore();
        String country = "Niger";
        store.addProductsToCart();
        CartPage cart = homePage.goToCart();
        cart.proceedToCheckout();
        CheckoutPage checkout = cart.proceedToCheckout();
        checkout.selectCountry(country);
    }
}

