package com.klymchuk.automationPatterns._6_decorator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by iklymchuk on 3/7/17.
 */
public class EventListenerTest {

    private WebDriver driver;
    private EventListener eventListener;
    private EventFiringWebDriver eventDriver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        eventListener = new EventListener();
        eventDriver.register(eventListener);
    }

    @Test
    public void test() {

    }

    @AfterClass
    public void tearDown() {
        if (eventDriver != null) {
            eventDriver.quit();
        }
    }
}
