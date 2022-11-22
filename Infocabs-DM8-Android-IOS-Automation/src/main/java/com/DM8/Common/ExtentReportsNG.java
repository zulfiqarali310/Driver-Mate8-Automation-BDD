package com.DM8.Common;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportsNG  extends BaseClass{
	static ExtentReports extent;

	public static  ExtentReports geReporterObject() {

		
		System.out.println("Driver from ExtentReport : " +driver);
		String path =System.getProperty("user.dir")+"//Reports//ExtentReports//DM8Reports.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Test Report for my AppiumCucumber Project");
		reporter.config().setEncoding("utf-8");
		reporter.config().setReportName("My TestSuite Report");	
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("HostName", "Driver Mate8");
		extent.setSystemInfo("ProjectName", "Infocabs-DM8-Automation");
		extent.setSystemInfo("Tester", "Zulfiqar");
		extent.setSystemInfo("OS", "Android/IOS");
		return extent;

	}

	



}
