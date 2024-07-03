package com.fuzzy.pages.mail_ru;

import com.fuzzy.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewMessagePage extends BasePage {

    private By toInput = By.xpath("//div[@data-name='to']//input");
    private By messageSubjectInput = By.xpath("//input[@name='Subject']");
    private By messageBodyInput = By.xpath("//div[@role='textbox']/div[1]");
    private By sendButton = By.xpath("//button[@data-test-id='send']");


    public NewMessagePage(WebDriver driver) {
        super(driver);
    }

    public NewMessagePage setRecipient(String recipient){
        inputText(toInput, recipient);
        return this;
    }

    public NewMessagePage setMessageSubject(String subject){
        inputText(messageSubjectInput, subject);
        return this;
    }

    public NewMessagePage setMessageBody(String body){
        inputText(messageBodyInput, body);
        return this;
    }

    public NewMessagePage sendMessage(){
        clickTo(sendButton);
        return this;
    }

}
