package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class ShopNowButtonTest extends BaseTest {
@Test

    public void shopNowButtonTest(){
    SoftAssert soft=new SoftAssert();
    HomePage home = new HomePage(driver);
    var shopNow = home.gotoShopNow();
    var actualResult = shopNow.getStorePageHeading();
    var expectedResult = "Store";
    soft.assertEquals(actualResult,expectedResult,"Buy now button functionality failed");
}
}
