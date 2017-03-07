package com.klymchuk.automationPatterns._2_factory;

import com.klymchuk.automationPatterns._1_pageObject.MainPage;
import com.klymchuk.automationPatterns._1_pageObject.TestPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by iklymchuk on 2/27/17.
 *
 * For creation the page instances
 * Hides the driver!!! - initElements without "driver" param.
 *
 * Also factory can uses for creation complex test entities like User.
 * We can implemented some common objects like User.
 * It can looks like: createAdminUser()/createUniqueUser() - will fill all fields and added all permisions
 */
public class TestFactory {

    private TestPage testPage;
    private WebDriver driver;

    //WITHOUT FACTORY
    @Before
    public void openTestPage() {
        testPage = new MainPage(driver).openTestPage();
    }

    //WITH FACTORY
    @Before
    public void openTestPageFactory() {
        PageFactory.initElements(driver, MainPage.class).openTestPage();
    }
}
