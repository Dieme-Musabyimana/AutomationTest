package tests.ActionsForLoggenInUser;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountDetailsTest extends BaseTest {
    @Test
    public void verifyAccountDetails(){
        AccountPage account = homePage.goToAccount();
        account.login("Josue", "22222");
        account.goToAccountDetail();
        String actualCurrentUrl = driver.getCurrentUrl();
        String expectedStringUrl = "edit-account";
        soft.assertTrue(actualCurrentUrl.contains(expectedStringUrl), "Url mismatch");
        soft.assertAll();
    }
}
