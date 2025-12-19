package tests.ActionsForLoggenInUser;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.DownloadPage;

public class DownLoadTest extends BaseTest {
    @Test
public void DownloadTest(){AccountPage account = homePage.goToAccount();account.login("Josue","22222");
      DownloadPage download = account.goToDownloads();
      String actualResult = download.browseProduct();
      String expectedUrl = "/store/";
      soft.assertTrue(actualResult.contains(expectedUrl),"!!!!Clicing Browse product does not open the store page");
      soft.assertAll();
    }
}
