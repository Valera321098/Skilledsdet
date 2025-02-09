package com.skilledsdet.pages;

import com.skilledsdet.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage extends BasePage {

    @FindBy(xpath = "//h2[text()='All Courses']")
    private WebElement title;

    public CoursesPage(Browser browser) {
        super(browser);
        PageFactory.initElements(driver, this);
    }

    public boolean isOpened() {
        return title.isDisplayed();
    }
}
