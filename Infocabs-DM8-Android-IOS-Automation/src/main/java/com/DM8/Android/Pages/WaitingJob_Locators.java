package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class WaitingJob_Locators extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public WaitingJob_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement ButtonAccept;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_return_job")
	WebElement ReturnJobButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_send_no_show")
	WebElement SendNoToShowJobButton;
	

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/rl_go_back")
	WebElement GobackButton;

	// Meter Locators

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_cost")
	WebElement Costtext;
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_cost")
	WebElement MeterFareValue;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/textisJobPaid")
	WebElement PrePaidtext;
	

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_milesLabel")
	WebElement Distancemilestext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_miles")
	WebElement Milestext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_top_expand")
	WebElement MeterExpandbutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/progress_waiting")
	WebElement WaitingProgressicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_waitingLabel")
	WebElement Waitingtext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/chronometer_waitingTime")
	WebElement MeterwaitingTimer;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_tariff_label")
	WebElement TarifLabletext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_tariff")
	WebElement Tarifvaliuetext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_waitingCostLabel")
	WebElement WaitingLablestext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_waitingCost")
	WebElement WaitingCostsvalue;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_extraCostLabel")
	WebElement ExtraCostLabletext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_extraCost")
	WebElement ExtraCostvaluetext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_DiscountLabel")
	WebElement DiscountLabeltext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_Discount")
	WebElement DiscounttextValue;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_start_waiting")
	WebElement StartWaitingButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/button_waitingSMS")
	WebElement SendSMSAlertRindbackbutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/dialog_title")
	WebElement SendSMSAlerttitile;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/dialog_message")
	WebElement SendSMSAlertDetailstext;
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_negative")
	WebElement SendSMSAlertOkButtonAndText;

	// Waiting Screen Other Locators

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_re_route")
	WebElement Gettingreouticon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_curr_location")
	WebElement Gettingcurrentlocationicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_start_navigation_map")
	WebElement Gettingnavigationicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/sepp")
	WebElement clicktoScrollJButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_pickup")
	WebElement VerifyPickUpwholeblock;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_dropoff")
	WebElement VerifyDroffwholeblock;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_pickup_zone")
	WebElement TextPickupZone;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_pickup_address")
	WebElement TextPickAddress;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_dropoff_zone")
	WebElement TextDropoffZone;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_dropoff_address")
	WebElement TextDropoffAddress;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/edt_notes")
	WebElement GettingDriverNotes;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_job_type")
	WebElement TextJobType;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_payment")
	WebElement TextJobPaymentMethod;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_booking")
	WebElement TextJobBookingType;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_tariffName")
	WebElement TextTariff;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_send_no_show")
	WebElement ClickOnSendNoShowButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/alertTitle")
	WebElement SendNoShowAlertTitile;

	@FindBy(how = How.ID, using = "android:id/message")
	WebElement SendNoShowDetailstext;

	@FindBy(how = How.ID, using = "android:id/button2")
	WebElement SendNotext;

	@FindBy(how = How.ID, using = "android:id/button1")
	WebElement SendYesButtontext;

	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");
	}

	public void ClickOnReturnJob() {

		click(ReturnJobButton, "Click on Return Job Button");
	}

	public void ClickOnSendNotoShowJob() {

		click(SendNoToShowJobButton, "Click on Send No To Show Job Button");
	}

	public void ClickOnGobackButton() {

		click(GobackButton, "Click on Go Back Button");
	}

	// Meter Methods

	public boolean CheckCosttext() {
		return Costtext.isDisplayed();
	}
	
	public String GetMeterFareValue() {

		return getText(MeterFareValue);

	}

	public String Getdistancetext() {

		return getText(Distancemilestext);

	}

	public boolean CheckmilestextValues() {
		return Milestext.isDisplayed();
	}

	public boolean CheckProgresswaitingImageIcon() {
		return WaitingProgressicon.isDisplayed();
	}

	public String GetwaitingLabletexttext() {

		return getText(Waitingtext);

	}

	public boolean Checkwaitingtimervalue() {
		return MeterwaitingTimer.isDisplayed();
	}

	public void ClickOnMeterExpandButton() {

		click(MeterExpandbutton, "Click on Meter Expand Button");

	}

	public String GetTarifftext() {

		return getText(TarifLabletext);

	}

	public String GetTariffValue() {

		return getText(Tarifvaliuetext);

	}

	public String GetWaitinglabeltext() {

		return getText(WaitingLablestext);

	}

	public boolean CheckwaitingVlaue() {
		return WaitingCostsvalue.isDisplayed();
	}
	
	
	public String GetMeterWaitingCostValue() {

		return getText(WaitingCostsvalue);

	}

	public String GetExtralabeltext() {

		return getText(ExtraCostLabletext);

	}

	public boolean CheckExtraVlaue() {
		return ExtraCostvaluetext.isDisplayed();
	}

	public String GetDiscountPercenatgetext() {

		return getText(DiscountLabeltext);

	}

	public boolean CheckDiscountPercentageVlaue() {
		return DiscounttextValue.isDisplayed();
	}

	public String GetStartstopwaitingbuttontext() {

		return getText(StartWaitingButton);

	}
	
	public boolean VerifyStartStopWaitingtext() {
		return StartWaitingButton.isDisplayed();
	}

	public void ClickOnStartstopWaitingButton() {

		click(StartWaitingButton, "Click on Start and stop Waiting Button");

	}

	public boolean CheckSendSMSRingbackicon() {
		return SendSMSAlertRindbackbutton.isDisplayed();
	}

	public void ClickOnSendSMSRingBackButton() {

		click(SendSMSAlertRindbackbutton, "Click on Send SMS Ring Button");

	}

	public String GetSendSMSRingBackAlerttext() {

		return getText(SendSMSAlerttitile);

	}

	public String GetSendSMSRingDetailstext() {

		return getText(SendSMSAlertDetailstext);

	}

	public String GetSendSMSRingBacOktext() {

		return getText(SendSMSAlertOkButtonAndText);

	}

	public void ClickOnSendSMSOKButton() {

		click(SendSMSAlertOkButtonAndText, "Click on Send SMS Ring back OK Button");

	}

	public void ClickOnSendNoShowutton() {

		click(ClickOnSendNoShowButton, "Click on Send No show Button");

	}

	public String GetSendSNoShowAlerttext() {

		return getText(SendNoShowAlertTitile);

	}

	public String GetSendSNoShowDetailstext() {

		return getText(SendNoShowDetailstext);

	}

	public String GetSendSNotext() {

		return getText(SendNotext);

	}

	public String GetSendShowYestext() {

		return getText(SendYesButtontext);

	}
	
	public String GetPrePaidtext() {

		return getText(PrePaidtext);

	}
	

	public void ClickOnSendNoShowYesButton() {

		click(SendYesButtontext, "Click on Send Show Yes Button text");

	}

	public boolean CheckNoShowAlerttext() {
		return SendSMSAlerttitile.isDisplayed();
	}

	public boolean CheckSMSAlertDetailstext() {
		return SendSMSAlertDetailstext.isDisplayed();
	}

}
