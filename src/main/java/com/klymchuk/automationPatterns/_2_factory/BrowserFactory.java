package com.klymchuk.automationPatterns._2_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by iklymchuk on 3/9/17.
 */
public enum BrowserFactory {

    CHROME {
        public WebDriver create(){
            return new ChromeDriver();
        }
    },
    IE {
        public WebDriver create(){
            return new InternetExplorerDriver();
        }
    },
    FIREFOX {
        public WebDriver create() {
            return new FirefoxDriver();
        }
    };

    public WebDriver create(){
        return null;
    }
}
