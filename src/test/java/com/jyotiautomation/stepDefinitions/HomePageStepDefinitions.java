package com.jyotiautomation.stepDefinitions;

import com.jyotiautomation.helper.TestBase;
import io.cucumber.java.en.Given;


public class HomePageStepDefinitions extends TestBase {

    @Given("the home page title displayed as {string}")
    public void verifyHomePageTitle(String homePageTitle){
        System.out.println("Expected HomePage title : "+homePageTitle);
        System.out.println("Actual HomePage title : "+driver.getTitle());
        assert driver.getTitle().equals(homePageTitle): "Title Mismatch";
        System.out.println("Homepage title verification successful.");
    }

}
