package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class NavigationMenusTests extends BaseTest {

    @Test
    public void storePageTest() {
        HomePage home = new HomePage(driver);
        var storePage = home.goToStore();
        var actualResult = storePage.getStorePageHeading();
        var expectedResult = "Store";
        soft.assertEquals(actualResult, expectedResult,"Store redirection failed");
        soft.assertAll();

    }

    @Test
    public void menPageTest() {
        HomePage home = new HomePage(driver);
        var menPage = home.goToMen();
        var actualMenResult = menPage.getMenPageHeading();
        var expectedResult = "Men";
        soft.assertEquals(actualMenResult, expectedResult, "Men redirection failure");
        soft.assertAll();
    }

    @Test
    public void womenPageTest() {
        HomePage home = new HomePage(driver);
        var womenPage = home.goToWomen();
        var actualWomenResult = womenPage.getWomenPageHeading();
        var expectedWomenResult = "Women";
        soft.assertEquals(actualWomenResult, expectedWomenResult, "Women redirection failure");
        soft.assertAll();
    }

    @Test
    public void AccessoriesPageTest() {
        HomePage home = new HomePage(driver);
        var accessoriesPage = home.goToAccessories();
        var actualAccessoriesResult = accessoriesPage.getAccessoriesHeading();
        var expectedAccessoriesResult = "Accessories";
        soft.assertEquals(actualAccessoriesResult, expectedAccessoriesResult, "Accessories redirection failure");
        soft.assertAll();
    }
@Test
    public void accountPageTest(){
        HomePage home = new HomePage(driver);
        var accountPage = home.goToAccount();
        var actualAccountResult = accountPage.getAccountHeadingPage();
        var expectedAccountResult = "Account";
        soft.assertEquals(actualAccountResult,expectedAccountResult,"Account redirection failed");
        soft.assertAll();
}
@Test
public void aboutPageTest(){
    HomePage home = new HomePage(driver);
    var aboutPage = home.goToAbout();
    var actualAboutResult = aboutPage.getAboutHeadingPage();
    var expectedAboutResult = "About Us";
    soft.assertEquals(actualAboutResult,expectedAboutResult,"Account redirection failed");
    soft.assertAll();
}
@Test
    public void contactUsPageTest(){
        HomePage home = new HomePage(driver);
        var contactUsPage = home.goToContactUs();
        var actualContactResult = contactUsPage.getContactUsPageHeading();
        var expectedContactUsResult = "Contact s";
        soft.assertEquals(actualContactResult,expectedContactUsResult,"Contact Us page redirection failure");
        soft.assertAll();
}
@Test
public void CartPageTest(){
        HomePage home = new HomePage(driver);
        var cartPage = home.goToCart();
        var actualCartResult = cartPage.getCartPageHeading();
        var expectedCartResult = "Cart";
        soft.assertEquals(actualCartResult,expectedCartResult,"Cart redirection failed");
        soft.assertAll();
}
}