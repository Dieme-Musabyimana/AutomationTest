package tests.AccountTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithExistingAccount(){
        AccountPage account = homePage.goToAccount();
       var dashBoardPage =  account.login("Patrick","123455");
       var actualResult =  dashBoardPage.getDashboardMessage();
       var expectedResult = "Dashboard";
       soft.assertEquals(actualResult,expectedResult,"Login Failed!!!");
        soft.assertAll();
    }
    @Test
    public void loginWithInvalidUsername(){
        AccountPage account = homePage.goToAccount();
        account.login("","123455");
        var actualResult = account.getErrorMessage();
        var expectMessage = "Username is required.";
        soft.assertTrue(actualResult.contains(expectMessage),"verify login with invalid credentials failed");
        soft.assertAll();
    }
    @Test
    public void logingWithNonExistingAccount(){
        AccountPage account = homePage.goToAccount();
        String username="Jan";
        account.login(username,"123455");
        var actualResult = account.getErrorMessage();
        var expectedMessage = "The username "+username+" is not registered on this site.";
        soft.assertTrue(actualResult.contains(expectedMessage),"Test fails");
        soft.assertAll();
    }
    @Test
    public void loginInWithIncorrectPassword(){
        AccountPage account = homePage.goToAccount();
        account.login("Patrick","123333");
        var actualResult = account.getErrorMessage();
        var acceptedMessage = "incorrect";
        soft.assertTrue(actualResult.contains(acceptedMessage),"Login with incorrect password test failed");
        soft.assertAll();
    }
}
