package com.jyotiautomation.stepDefinitions;

import com.jyotiautomation.helper.PropertyReader;
import com.jyotiautomation.helper.TestBase;
import com.jyotiautomation.pages.LoginPage;
import io.cucumber.java.en.Given;


public class LoginPageStepDefinitions extends TestBase {

    private LoginPage loginPage = new LoginPage(driver);

    @Given("the user login to the application")
    public void loginToApp(){
        loginPage.loginToApp(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
    }
}
