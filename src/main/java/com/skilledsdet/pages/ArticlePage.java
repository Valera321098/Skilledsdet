package com.skilledsdet.pages;

import com.skilledsdet.Browser;
import com.skilledsdet.components.ArticleContainer;
import com.skilledsdet.dto.ArticleContainerDto;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ArticlePage extends BasePage {

    private final static String URL = "/articles";

    @FindBy(xpath = "//h2[text()='All Articles']")
    private WebElement title;
    @FindBy(css = "li.wp-block-post")
    private List<WebElement> articleContainerElementList;

    public ArticlePage(Browser browser) {
        super(browser);
        PageFactory.initElements(driver, this);
    }

    public ArticlePage open() {
        driver.get(BASE_URL + URL);
        return this;
    }

    public boolean isOpened() {
        return title.isDisplayed();
    }

    @Step("Get articles list")
    public List<ArticleContainerDto> getArticlesList() {
        List<ArticleContainer> articleContainerList = new ArrayList<>();
        articleContainerElementList.forEach(element -> articleContainerList.add(new ArticleContainer(element)));
        return articleContainerList.stream().map(container -> ArticleContainerDto.builder()
                .pictureLink(container.getPictureLink())
                .title(container.getTitle())
                .dateToPost(container.getPostDate())
                .timeToRead(container.getTimeToRead())
                .build()).toList();
    }
}
