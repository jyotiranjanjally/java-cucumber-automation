package com.jyotiautomation.stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"com/jyotiautomation/stepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "junit:target/reports/report.xml", "json:target/cucumber.json", "html:target/reports/report.html"},
        tags = "test1")
public class TestRunner {
}
