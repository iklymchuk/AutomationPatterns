package com.klymchuk.automationPatterns._2_factory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by iklymchuk on 3/9/17.
 */
public class TestBrowserFactory {

    private WebDriver driver;

    @Test
    public void browserFactoryTest() {
        driver = BrowserFactory.CHROME.create();
    }
}
