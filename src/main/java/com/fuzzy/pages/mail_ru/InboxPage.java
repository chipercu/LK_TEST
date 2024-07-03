package com.fuzzy.pages.mail_ru;

import com.fuzzy.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage extends BasePage {

    private final By newMessageLink = By.xpath("//a[@href='/compose/']");

    public InboxPage(WebDriver driver) {
        super(driver);
    }

    public InboxPage switchToNewMessageFrame(){
        clickTo(newMessageLink);
        return this;
    }



}
