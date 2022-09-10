package com.jyotiautomation.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	public  static WebDriver driver;

	public WebDriver selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
//				driver = new ChromeDriver();
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

		return driver;
	}
}