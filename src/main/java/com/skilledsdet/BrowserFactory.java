package com.skilledsdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public enum BrowserFactory {
    CHROME {
        @Override
        public WebDriver createDriver() {
            return new ChromeDriver();
        }
    },
    FIREFOX {
        @Override
        public WebDriver createDriver() {
            return new FirefoxDriver();
        }
    },
    SAFARI {
        @Override
        public WebDriver createDriver() {
            return new SafariDriver();
        }
    };

    public abstract WebDriver createDriver();
}
