package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class HoverTest extends BaseTest {
    @Test
    public void HoverTest(){
        StorePage store = homePage.goToStore();
        store.addProductsToCart();
       String actualResults = homePage.hoverToCart();
       String expectedUrl = "https://askomdch.com/cart/";
       soft.assertEquals(actualResults,expectedUrl,"VIEW CART Button was not clicked from hover drop down");
       soft.assertAll();


    }
}
