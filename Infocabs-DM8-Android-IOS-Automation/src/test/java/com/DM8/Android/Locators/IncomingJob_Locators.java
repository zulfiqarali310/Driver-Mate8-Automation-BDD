package com.DM8.Android.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class IncomingJob_Locators extends ScreenActions {
	
	AppiumDriver driver;
	Utility util = new Utility();

	public IncomingJob_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_jobTitle")
	WebElement TextJobTitle;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_reject")
	WebElement TextRejectedAndButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_jobTimer")
	WebElement TextJobTimer;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_pickup_zone")
	WebElement TextPickupZone;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_pickup_address")
	WebElement TextPickAddress;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_dropoff_zone")
	WebElement TextDropoffZone;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_dropoff_address")
	WebElement TextDropoffAddress;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_show_on_map")
	WebElement TextAndButtonShowonMape;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_job_type")
	WebElement TextJobType;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_payment")
	WebElement TextJobPaymentMethod;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_booking")
	WebElement TextJobBookingType;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_tariff")
	WebElement TextTariff;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement ButtonAccept;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_dispatch_type")
	WebElement TextDispatchtype;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_booked_by")
	WebElement TextBokkedtype;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_customer_rating")
	WebElement TextCustomerRating;
	
	
	public void ClickOnRejected() {

		click(TextRejectedAndButton, "Click on Login Button");

	}
	
	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");

	}
	

}
