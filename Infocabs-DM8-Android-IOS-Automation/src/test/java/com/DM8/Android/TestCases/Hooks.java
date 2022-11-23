package com.DM8.Android.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import com.DM8.Common.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	BaseClass base;

	public Hooks(BaseClass base) {
		this.base = base;
	}

	@Before
	public void Invoke1(Scenario scenario) throws IOException,InterruptedException {

		startAppiumServer(ipAddress, Integer.parseInt(port));
		setAndroidCapabilities();
		System.out.println("Driver from On capability started : " + driver);
		
	}
	
	
	@After(order = 1)
	public void TakeScreesnhotforReport(Scenario scenario) throws IOException {
		
		
		System.out.println("Status of Scenario: " + scenario.getStatus());
		System.out.println("failed Scenario: " + scenario.isFailed());
		
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}

	@AfterTest
	public void teardown() {
		System.out.println("Driver before quiting : " + driver);

		stopappium();
		closeAppium();
	}

}
