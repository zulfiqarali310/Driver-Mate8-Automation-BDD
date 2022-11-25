package com.DM8.Android.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import com.DM8.Common.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	BaseClass base;

	public Hooks(BaseClass base) {
		this.base = base;
	}

	@Before
	public void Invoke1(Scenario scenario) throws InterruptedException {

		startAppiumServer(ipAddress, Integer.parseInt(port));
		setAndroidCapabilities();

	}

	@AfterStep
	public void TakeScreesnhotforReport(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			// screenshot
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", scenario.getName());
		}
	}

	@AfterTest
	public void teardown() {
		stopappium();
		closeAppium();
	}

}
