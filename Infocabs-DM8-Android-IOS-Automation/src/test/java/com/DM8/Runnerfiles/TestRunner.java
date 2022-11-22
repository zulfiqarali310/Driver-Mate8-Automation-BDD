package com.DM8.Runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Featuresfiles",

		glue = { "com/DM8/Android/TestCases" },

		plugin = { "pretty", "html:Reports/HTMLReports/Cucumberplugin.html",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		monochrome = true, dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
