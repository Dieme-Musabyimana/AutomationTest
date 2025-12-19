package tests.ProductInteractionTests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class FilterByPriceRangeTest extends BaseTest {
    @Test
    public void filterByPriceRangeTest() {
        StorePage store = homePage.goToStore();

        int targetMin = 20;
        int targetMax = 120;

        store.filterByPriceRange(targetMin, targetMax);

    }
}
