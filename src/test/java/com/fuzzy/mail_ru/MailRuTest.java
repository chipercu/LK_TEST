package com.fuzzy.mail_ru;

import com.fuzzy.base.BaseTest;
import org.testng.annotations.Test;

import static com.fuzzy.common.Constants.MAIL_RU_HOME_PAGE;
import static com.fuzzy.common.Constants.MAIL_RU_LOGIN;
import static com.fuzzy.common.Constants.MAIL_RU_PASS;

public class MailRuTest extends BaseTest {

    @Test
    public void loginToMailRuAndSendMessageTest() {

        loginPage.openLoginForm(MAIL_RU_HOME_PAGE)
                .switchToLoginFrame()
                .inputAccountName(MAIL_RU_LOGIN)
                .moveToPasswordFrame()
                .inputPassword(MAIL_RU_PASS)
                .submit();

        driver.switchTo().defaultContent();

        inboxPage.switchToNewMessageFrame();

        newMessagePage
                .setRecipient(MAIL_RU_LOGIN)
                .setMessageSubject("Test Message")
                .setMessageBody("Any text")
                .sendMessage();
    }



}
