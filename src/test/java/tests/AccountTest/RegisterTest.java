package tests.AccountTest;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class RegisterTest extends BaseTest {
    @Test
    public void registerWithValidDataTest() {
        SoftAssert soft = new SoftAssert();
        String validUsername = "Patrick";
        String validEmail = "patrick@gmail.com";
        String validPassword = "123455";
        HomePage home = new HomePage(driver);
        var accountPage = home.goToAccount();
        var dashboardPage = accountPage.setValidCredentials(validUsername, validEmail, validPassword);
        var actualResult = dashboardPage.getDashboardMessage();
        var expectedResult = "Dashboard";
        soft.assertEquals(actualResult, expectedResult, "Dashboard do not load");
        soft.assertAll();

    }

    @Test
    public void registerWithInvalidDataTest() {
            SoftAssert soft = new SoftAssert();
            String validUsername = "";
            String validEmail = "dim@gmail.com";
            String validPassword = "123455";
            HomePage home = new HomePage(driver);
            var accountPage = home.goToAccount();
            var dashboardPage = accountPage.setValidCredentials(validUsername, validEmail, validPassword);
            var actualResult = accountPage.getErrorMessage();
            var expectedResult = "Error: Please enter a valid account username.";
            soft.assertEquals(actualResult, expectedResult, "Dashboard do not load");
            soft.assertAll();

        }
        @Test
    public void registerWithExistingAccountTest(){
            SoftAssert soft = new SoftAssert();
            String validUsername = "Patrick";
            String validEmail = "patrick@gmail.com";
            String validPassword = "123455";
            HomePage home = new HomePage(driver);
            var accountPage = home.goToAccount();
            var dashboardPage = accountPage.setValidCredentials(validUsername, validEmail, validPassword);
            var actualResult = accountPage.getErrorMessage();
            var expectedResult = "Error: An account is already registered with your email address. Please log in.";
            soft.assertEquals(actualResult, expectedResult, "Dashboard do not load");
            soft.assertAll();
        }


    }

