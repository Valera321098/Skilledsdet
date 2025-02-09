package com.skilledsdet.pages;

import com.skilledsdet.Browser;
import com.skilledsdet.components.Header;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "(//div[@class='wp-block-template-part'])[1]")
    private WebElement headerElement;
    @FindBy(xpath = "(//h2[contains(@class, 'wp-block-heading')])[1]")
    private WebElement title;

    @Getter
    private Header header = new Header(browser);

    public MainPage(Browser browser) {
        super(browser);
    }

    @Step("Open Main page")
    public MainPage open() {
        driver.get(getUrl());
        return this;
    }

    public String getTitle() {
        return title.getText();
    }
}
