package com.skilledsdet.components;

import com.skilledsdet.Browser;
import com.skilledsdet.pages.ArticlePage;
import com.skilledsdet.pages.BasePage;
import com.skilledsdet.pages.CoursesPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

    @FindBy(xpath = "(//div[@class='wp-block-site-logo'])[1]")
    WebElement logo;
    @FindBy(xpath = "(//h1/a[@rel='home'])[1]")
    WebElement headerTitle;
    @FindBy(css = "a[href='https://skilledsdet.com/articles/'] strong")
    WebElement articleButton;
    @FindBy(css = "a[href='https://skilledsdet.com/all-my-courses/'] strong")
    WebElement coursesButton;

    public Header(Browser browser) {
        super(browser);
    }

    @Step("Go to the Articles page")
    public ArticlePage goToArticlePage() {
        articleButton.click();
        return new ArticlePage(browser);
    }

    @Step("Go to the Courses page")
    public CoursesPage goToCoursesPage() {
        coursesButton.click();
        return new CoursesPage(browser);
    }

    public String getTitle() {
        return headerTitle.getText();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public boolean isArticleButtonDisplayed() {
        return articleButton.isDisplayed();
    }

    public boolean isCoursesButtonDisplayed() {
        return coursesButton.isDisplayed();
    }
}
