package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class FeedbackJob_Locators extends ScreenActions {

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

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_heading")
	WebElement TextJobDetails;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_job_no")
	WebElement TextJobNumber;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_pickup")
	WebElement PickupIcon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_dropoff")
	WebElement Dropofficon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_customer_name")
	WebElement CheckCustomername;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/rb_customer")
	WebElement CustomerFeedbackStars;

	public void ClickOnSubmit() {

		click(ButtonSubmit, "Click on Login Button");

	}

	public void WriteFeedback(String fd) {

		sendKeys(EditFeedback, fd, "Login with Driver Code" + fd);
	}

	public String GetSubmitbuttontext() {

		return getText(ButtonSubmit);

	}

	public String GetJobDetailstext() {

		return getText(TextJobDetails);

	}

	public boolean CheckJobNumberwithtext() {
		return TextJobNumber.isDisplayed();
	}

	public boolean Checkpickupicon() {
		return PickupIcon.isDisplayed();
	}

	public boolean CheckDropofficon() {
		return Dropofficon.isDisplayed();
	}

	public boolean CheckCustomername() {
		return CheckCustomername.isDisplayed();
	}

	public boolean CheckFeedbackStars() {
		return CustomerFeedbackStars.isDisplayed();
	}

	public void ClickOnFeedbackStarsbutton() {

		click(CustomerFeedbackStars, "Click Feed back stars button");

	}

}
