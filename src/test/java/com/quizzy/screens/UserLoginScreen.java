package com.quizzy.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class UserLoginScreen extends BaseScreen{
    public UserLoginScreen(AndroidDriver driver) {
        super(driver);
    }
  public UserLoginScreen fillEmail(String email){
   //getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("sharifk064@gmail.com");
   getWebElement(By.xpath("EditText[1]")).sendKeys("sharifk064@gmail.com");
  return this;
  }
  public UserLoginScreen fillPassword(String password) {
      //getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("11223344");
      getWebElement(By.xpath("//EditText[2]")).sendKeys("11223344");
      return this;

  }
public HomeScreen clickSignInBtn(){
        getWebElement(By.id("SIGN IN")).click();
        return getInstance(HomeScreen.class);
}
public UserLoginScreen clickSignInFail(){
    getWebElement(By.id("SIGN IN")).click();
    return this;
}
    public UserLoginScreen doSignIn(){
        return clickSignInFail();
    }
    public UserLoginScreen doSignIn(String email){
        return fillEmail(email)
                .clickSignInFail();
    }
    public HomeScreen doSignIn(String email,String password){
        return fillEmail(email)
                .fillPassword(password)
                .clickSignInBtn();
    }

    public boolean hasError(){
   return getWebElements(By.id("Please enter your email")).size()>0;
    }

  }

