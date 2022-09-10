package com.jyotiautomation.stepDefinitions;

import com.jyotiautomation.helper.LoggerHelper;
import com.jyotiautomation.helper.PropertyReader;
import com.jyotiautomation.helper.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks extends TestBase {

	TestBase testBase;

	Logger log = LoggerHelper.getLogger(ServiceHooks.class);

	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectBrowser(PropertyReader.getProperty("browser"));
		driver.get(PropertyReader.getProperty("app_url"));
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				log.info(scenario.getName() + " is pass");
				scenario.attach(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		TestBase.driver.quit();
	}
}
