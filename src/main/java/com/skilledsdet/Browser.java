package com.skilledsdet;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.Duration;

import static com.skilledsdet.config.FrameworkPropertiesProvider.FRAMEWORK_PROPERTIES;

public class Browser {

    private final WebDriver driver;

    public Browser(BrowserFactory browserFactory) {
        driver = browserFactory.createDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FRAMEWORK_PROPERTIES.timeout()));
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit() {
        driver.quit();
    }
}
