package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.StorePage;

public class ProceedToCheckoutTest extends BaseTest {

    @Test
    public void fillFormTest(){
        StorePage store = homePage.goToStore();
        store.addProductsToCart();
        String country = "United States (US)";
        String state = "California";
        CartPage cart = homePage.goToCart();
        var CheckOutPage=cart.proceedToCheckout();
        CheckOutPage.selectCountry(country);
        CheckOutPage.selectState(state);
        CheckOutPage.fillCheckoutForm(
                "John",
                "Karake",
                "Street 12",
                "Kigali",
                "00000",
                "karake@gmail.com",
                   "Hey, I am placing this order, I hope it is free delivery right?"   );

        CheckOutPage.placeOrder();


    }
}

