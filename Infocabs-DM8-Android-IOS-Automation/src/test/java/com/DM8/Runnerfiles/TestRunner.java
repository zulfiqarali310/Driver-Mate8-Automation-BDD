package com.DM8.Runnerfiles;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.DM8.Common.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featuresfiles",

		glue = { "com/DM8/Android/TestCases" },

		plugin = { "pretty", "html:Reports/HTMLReports/Cucumberplugin.html",

				"json:target/cucumber/cucumber.json",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		monochrome = true, dryRun = false, tags = "@Splashes or @Login or @Desclaimer or ~@HomeScreen or ~@Jobflow or "
				+ "~@ShowonMapJobRejection or "
				+ "~@ReturnJob or ~@Gettinglate or ~@DriversMessages "
				+ "or ~@StartNavigation or ~@SendSMSRingBackSendNoShow or "
				+ "~@GobackChangeDropoffAddextra or ~@JobPayments or "
				+ "~@FixedPriceJobs or ~@Pre-CalculatedJobs or ~@AccountJobs or "
				+ "~@WaitingTimeCharges or ~@SplashesLogintestScenarios or @QRCodeScannerPayment or "
				+ "~@BackgroundActionsIncomingAndJobs"

)

public class TestRunner {

	@BeforeClass
	public static void Invoke1() throws InterruptedException {

		BaseClass.startAppiumServer();
		BaseClass.setAndroidCapabilities();

	}

	@AfterClass
	public static void teardown() {
		BaseClass.stopappium();
		BaseClass.closeAppium();
	}

}
