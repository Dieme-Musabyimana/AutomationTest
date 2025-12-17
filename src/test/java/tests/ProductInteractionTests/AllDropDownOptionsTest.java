package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

import java.util.List;

public class AllDropDownOptionsTest extends BaseTest {
    @Test
    public void AllDropDownOptionsTest(){
        StorePage store = homePage.goToStore();
        List<String> actualDropDownOptions = store.getAllDropDowns();
        List<String> expectedDropDownOptions = List.of(
                "Default sorting",
                "Sort by popularity",
                "Sort by average rating",
                "Sort by latest",
                "Sort by price: low to high",
                "Sort by price: high to low"
        );
soft.assertEquals(actualDropDownOptions,expectedDropDownOptions,"dropDowns do not match");
soft.assertAll();
    }
}
