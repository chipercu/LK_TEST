package com.fuzzy.base;

import com.fuzzy.common.CommonActions;
import com.fuzzy.pages.base.BasePage;
import com.fuzzy.pages.mail_ru.InboxPage;
import com.fuzzy.pages.mail_ru.LoginPage;
import com.fuzzy.pages.mail_ru.NewMessagePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected InboxPage inboxPage = new InboxPage(driver);
    protected NewMessagePage newMessagePage = new NewMessagePage(driver);



    @AfterTest
    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }

    @AfterSuite
    public void close(){
        driver.quit();
    }



}
