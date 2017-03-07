package com.klymchuk.automationPatterns._8_dataProvider;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by iklymchuk on 3/7/17.
 *
 * Test Data shouldn't located to the @Test
 *
 * We can use serialization/deserialization mechanism.
 */
@RunWith(DataProviderRunner.class)
public class JUnitDataProviderTest {

    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                { "abc", "abc" },
                { "cba", "abc" },
        };
    }

    @Test
    @UseDataProvider("data")
    public void testSort(final String input, final String expected) {
    }
}
