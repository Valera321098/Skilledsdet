package com.skilledsdet.components;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Getter
public abstract class BaseComponent {

    private final WebElement self;

    public BaseComponent(WebElement self) {
        this.self = self;
        PageFactory.initElements(self, this);
    }
}
