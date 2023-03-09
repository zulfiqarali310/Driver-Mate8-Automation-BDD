package com.DM8.Android.TestCases;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class Pre_Calculated_Jobs extends BaseClass {
	
	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);
	
	
	

}
