package com.fuzzy.pages.mail_ru;

import com.fuzzy.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String loginFormXPath = "//div[@data-test-id='login-app-ready']";
    private final By loginFrame = By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']");
    private final By loginButton = By.xpath("//div[@id='mailbox']//button");
    private final By accountNameInput = By.xpath("//input[@name='username']");
    private final By domainSelector = By.xpath(loginFormXPath + "//div[@data-test-id='domain-select']");
    private final By nextButton = By.xpath(loginFormXPath + "//button[@data-test-id='next-button']");
    private final By authProblemsLink = By.xpath("//a[@data-test-id='auth-problems']");
    private final By usePasswordLink = By.xpath("//a[text()='Использовать пароль для входа']");
    private final By passwordInput = By.xpath("//input[@name='password']");
    private final By submitButton = By.xpath(loginFormXPath + "//button[@data-test-id='submit-button']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginForm(String url){
        driver.get(url);
        clickTo(loginButton);
        return this;
    }

    public LoginPage switchToLoginFrame(){
        driver.switchTo().defaultContent();
        WebElement element = driver.findElement(loginFrame);
        driver.switchTo().frame(element);
        return this;
    }


    public LoginPage inputAccountName(String accountName){
        inputText(accountNameInput, accountName);
        return this;
    }

    public LoginPage inputPassword(String password){
        inputText(passwordInput, password);
        return this;
    }

    public LoginPage moveToPasswordFrame(){
        clickTo(nextButton);
        clickTo(authProblemsLink);
        clickTo(usePasswordLink);
        return this;
    }

    public LoginPage submit(){
        clickTo(submitButton);
        return this;
    }






}
