package com.jyotiautomation.pages;
import com.jyotiautomation.helper.LoggerHelper;
import com.jyotiautomation.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.apache.log4j.Logger;


public class LoginPage {
    private WebDriver driver;

    Logger logger;
    WaitHelper waitHelper;

    By userNameInput = By.xpath("//input[@name='username']");
    By passwordInput = By.xpath("//input[@name='password']");
    By submitButton = By.xpath("//input[@type='submit' and @value='Log In']");


    public LoginPage(WebDriver webDriver) {
//        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
        this.driver = webDriver;
//        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
        waitHelper = new WaitHelper(driver);
        logger = LoggerHelper.getLogger(WaitHelper.class);
    }

    public void enterUsername(String username){
        driver.findElement(userNameInput).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickSubmitBitton(){
        driver.findElement(submitButton).click();
    }

    public void loginToApp(String username,String password){
        logger.info("Login to the application");
        this.enterUsername(username);
        this.enterPassword(password);
        this.clickSubmitBitton();
    }

}


//https://parabank.parasoft.com/parabank/index.htm
//jyotijally
//jyoti@123