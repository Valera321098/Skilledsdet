package com.skilledsdet.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticleContainer extends BaseComponent{

    @FindBy(css = "figure > a")
    private WebElement pictureLink;
    @FindBy(css = "h2 > a")
    private WebElement title;
    @FindBy(css = ".wp-block-post-date")
    private WebElement postDate;
    @FindBy(css = ".wp-block-post-time-to-read")
    private WebElement timeToRead;

    public ArticleContainer(WebElement self) {
        super(self);
    }

    public String getPictureLink() {
        return pictureLink.getDomAttribute("href");
    }

    public String getTitle() {
        return title.getText();
    }

    public String getPostDate() {
        return postDate.getText();
    }

    public String getTimeToRead() {
        return timeToRead.getText();
    }
}
