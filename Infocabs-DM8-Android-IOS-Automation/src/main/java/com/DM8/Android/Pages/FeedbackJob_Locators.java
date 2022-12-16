package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class FeedbackJob_Locators  extends ScreenActions  {
	
	
	
	AppiumDriver driver;
	Utility util = new Utility();

	public FeedbackJob_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_submit")
	WebElement ButtonSubmit;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/et_feedback")
	WebElement EditFeedback;
	
	
	
	public void ClickOnSubmit() {

		click(ButtonSubmit, "Click on Login Button");

	}
	
	
	

}
