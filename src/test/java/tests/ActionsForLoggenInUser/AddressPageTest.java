package tests.ActionsForLoggenInUser;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.AddressPage;
import pages.EditBillingAddressPage;

public class AddressPageTest extends BaseTest {
    @Test
    public void testAddressPageRedirection() {

        AccountPage account = homePage.goToAccount();
        account.login("Josue", "22222");
        AddressPage address = account.goToAddress();
        String actualURl = driver.getCurrentUrl();
        String expectedString = "address";
        soft.assertTrue(actualURl.contains(expectedString), "Url mismatch");
        soft.assertAll();
    }

    @Test
    public void verifyEditAddress() {
        AccountPage account = homePage.goToAccount();
        account.login("Josue", "22222");
        AddressPage address = account.goToAddress();
        EditBillingAddressPage editPage = address.goToEditBillingAddressPage();
        editPage.editBillingAddress("josue@gmail.com");
    }
}
