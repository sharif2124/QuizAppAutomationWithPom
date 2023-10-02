package com.quizzy.testcase;

import com.quizzy.screens.HomeScreen;
import com.quizzy.screens.UserLoginScreen;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest{
    @Test
    public void SignInShouldSuccess(){
        HomeScreen homeScreen = screen.getInstance(UserLoginScreen.class)
                .fillEmail("sharifk064@gmail.com")
                .fillPassword("11223344")
                .clickSignInBtn();
    }
}
