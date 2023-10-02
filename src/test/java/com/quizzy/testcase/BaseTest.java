package com.quizzy.testcase;

import com.quizzy.screens.BaseScreen;
import com.quizzy.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    Screen screen;
    @BeforeClass
    public void setUp(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("udid","e6e4dc80");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","10");
            capabilities.setCapability("appPackage","com.example.quizzy");
            capabilities.setCapability("appActivity",".MainActivity");
            capabilities.setCapability("automationName","UiAutomator2");


            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            screen = new BaseScreen(driver);


        } catch (
                MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}


