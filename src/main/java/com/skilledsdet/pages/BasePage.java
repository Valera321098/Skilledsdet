package com.skilledsdet.pages;

import com.skilledsdet.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.skilledsdet.config.FrameworkPropertiesProvider.FRAMEWORK_PROPERTIES;

public abstract class BasePage {

    protected static final String BASE_URL = FRAMEWORK_PROPERTIES.baseUrl();
    protected String path = "/";
    protected WebDriver driver;
    protected Browser browser;

    protected BasePage(Browser browser) {
        this.driver = browser.getDriver();
        this.browser = browser;
        PageFactory.initElements(driver, this);
    }

    public String getUrl() {
        return BASE_URL + path;
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}
