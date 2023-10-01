package com.quizzy.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseScreen extends Screen{
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        return null;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        return null;
    }

    @Override
    public void waitForWebElement(By locator) {

    }
}
