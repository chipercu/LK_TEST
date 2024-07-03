package com.fuzzy.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTo(By by){
        driver.findElement(by).click();
    }

    public void inputText(By input, String text){
        WebElement element = driver.findElement(input);
        element.click();
        element.sendKeys(text);
    }





}
