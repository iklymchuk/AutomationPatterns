package com.klymchuk.automationPatterns._1_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by iklymchuk on 2/27/17.
 *
 * Page Object - reuse the code
 *  - can composes the transition states;
 *  - encapsulate (hide) the page structure (elements and available methods);
 */
public class TestPage extends AbstractPage {

    private WebDriver driver;

    @FindBy(id = "user")
    @CacheLookup
    private WebElement userName;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement userPassword;

    @FindBy(id = "submit")
    @CacheLookup
    private WebElement submitForm;

    public TestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*
        encapsulate the implementation
     */
    public TestPage login (String name, String pass) {
        userName.sendKeys(name);
        userPassword.sendKeys(pass);
        submitForm.click();

        return new TestPage(driver);
    }

    /*
        encapsulate the implementation
     */
    public TestPage typeUserName(String name) {
        userName.sendKeys(name);
        return this;
    }

    public String getUserName() {
        return userName.getText();
    }

}
