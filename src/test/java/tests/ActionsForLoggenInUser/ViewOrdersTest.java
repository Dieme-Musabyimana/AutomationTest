package tests.ActionsForLoggenInUser;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;

public class ViewOrdersTest extends BaseTest {
@Test
    public void viewOrdersTest(){
    AccountPage account = homePage.goToAccount();
    account.login("Josue","22222");
    String actualResults = account.goToOrder().ClickViewBtn();
    String expectedCurrenUrl = "/view-order/";
    soft.assertTrue(actualResults.contains(expectedCurrenUrl),"!!!!View order failed!!!!!!!");
    soft.assertAll();
}
}
