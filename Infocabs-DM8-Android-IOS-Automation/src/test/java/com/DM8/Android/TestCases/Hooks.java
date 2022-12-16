package com.DM8.Android.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.DM8.Common.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	BaseClass base;

	public Hooks(BaseClass base) {
		this.base = base;
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

	

}
