package com.klymchuk.automationPatterns._1_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by iklymchuk on 2/27/17.
 */
public abstract class AbstractPage {

    public AbstractPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
