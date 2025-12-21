package tests.ActionsForLoggenInUser;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;

public class LogoutTest extends BaseTest {
    @Test
    public void verifyLogout(){
        AccountPage account = homePage.goToAccount();
        account.login("Josue","22222");
        account.logout();
        String actualCurrentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://askomdch.co/account/";
        soft.assertEquals(actualCurrentUrl,expectedUrl, "url mismatch");
        soft.assertAll();
    }
}
