package com.klymchuk.automationPatterns._1_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by iklymchuk on 2/27/17.
 */
public class MainPage extends AbstractPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TestPage openTestPage() {
            driver.get("localhost:8080");
        return new TestPage(driver);
    }

}
