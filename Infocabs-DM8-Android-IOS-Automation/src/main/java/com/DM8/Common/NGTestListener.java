package com.DM8.Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.DM8.Common.ExtentReportsNG;
import com.DM8.Common.Utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NGTestListener extends Utility implements ITestListener {

	

	ExtentTest test;
	ExtentReports extent = ExtentReportsNG.geReporterObject();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());

		try {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "- Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "- Test Case Failed", ExtentColor.RED));
			//test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(), driver),
					//result.getMethod().getMethodName());
			String imagpath = Utility.getScreenshotPath(result.getName(), BaseClass.driver);
			test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imagpath).build());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
//

}
