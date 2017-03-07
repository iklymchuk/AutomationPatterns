package com.klymchuk.automationPatterns._4_loadableComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.fail;

/**
 * Created by iklymchuk on 2/27/17.
 *
 * Problem:
 *  We need to know is page LOGICAL loaded and ready for use or not?
 *  Is elements are present?
 */
public class SomePage extends LoadableComponent<SomePage> {

    private final WebDriver driver;

    private SomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void load() {
        //we can use direct link to the page
        driver.get("/account/id123654");
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            driver.findElement(By.linkText("Accounts"));
        } catch (NoSuchElementException e) {
            fail("Cannot locate manage account link");
        }
    }
}
