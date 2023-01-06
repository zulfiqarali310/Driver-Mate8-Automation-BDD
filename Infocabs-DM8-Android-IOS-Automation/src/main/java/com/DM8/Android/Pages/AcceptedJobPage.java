package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class AcceptedJobPage extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public AcceptedJobPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement ButtonAccept;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_return_job")
	WebElement ReturnJobButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/alertTitle")
	WebElement Alerttitletext;

	@FindBy(how = How.ID, using = "android:id/message")
	WebElement Alertmessagetext;

	@FindBy(how = How.ID, using = "android:id/button1")
	WebElement AlertButton1yes;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/sepp")
	WebElement clicktoScrollJButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_person")
	WebElement Personicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_customer_name")
	WebElement Customername;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_getting_late")
	WebElement ButtonGettinglateiconbutton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_back")
	WebElement CrossBackButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_late")
	WebElement Lateicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_late_heading")
	WebElement TextHeading;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_late_desc")
	WebElement Text2ndDesc;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_pickup_address")
	WebElement TextPickupAddress;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_5_mins")
	WebElement Wait5minsbox;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_10_mins")
	WebElement Wait10minsbox;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_15_mins")
	WebElement Wait15minsbox;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/ll_20_mins")
	WebElement Wait20minsbox;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_continue")
	WebElement ButtonContinue;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_chat")
	WebElement GettingchaticonButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_re_route")
	WebElement Gettingreouticon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_curr_location")
	WebElement Gettingcurrentlocationicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_start_navigation_map")
	WebElement Gettingnavigationicon;

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

	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");

	}

	public void ClickOnReturnJob() {

		click(ReturnJobButton, "Click on Return job Button");

	}

	public String GetAlertTitletext() {

		return getText(Alerttitletext);

	}

	public String GetAlertmessage() {

		return getText(Alertmessagetext);

	}

	public void ClickOnYesButton() {

		click(AlertButton1yes, "Click on Yes Button");

	}

	public String GetWaitingbuttontext() {

		return getText(ButtonAccept);

	}

	public boolean CheckPersonimageicon() {
		return Personicon.isDisplayed();
	}

	public boolean CheckCustomerNameicon() {
		return Customername.isDisplayed();
	}

	public boolean CheckLateicon() {
		return ButtonGettinglateiconbutton.isDisplayed();
	}

	public boolean CheckChaticon() {
		return GettingchaticonButton.isDisplayed();
	}

	public boolean CheckRerouticon() {
		return Gettingreouticon.isDisplayed();
	}

	public boolean CheckGetcurrentlocationicon() {
		return Gettingcurrentlocationicon.isDisplayed();
	}

	public boolean CheckGetNavigationicon() {
		return Gettingnavigationicon.isDisplayed();
	}

	public boolean CheckPickUpwholeblock() {
		return VerifyPickUpwholeblock.isDisplayed();
	}

	public boolean CheckDropofwhole() {
		return VerifyDroffwholeblock.isDisplayed();
	}

	public boolean GetPickupZonetext() {

		return TextPickupZone.isDisplayed();
	}

	public boolean GetPickupAddresstext() {

		return TextPickAddress.isDisplayed();
	}

	public boolean GetDropoffZonetext() {

		return TextDropoffZone.isDisplayed();
	}

	public boolean GetDropoffAddresstext() {

		return TextDropoffAddress.isDisplayed();
	}

	public boolean GetJobTypetext() {

		return TextJobType.isDisplayed();
	}

	public boolean GetJobPaymenttext() {

		return TextJobPaymentMethod.isDisplayed();
	}

	public boolean GetJobBookingtext() {

		return TextJobBookingType.isDisplayed();
	}

	public boolean GetJobTarifftext() {

		return TextTariff.isDisplayed();
	}

	public boolean GetDriverNotestext() {

		return GettingDriverNotes.isDisplayed();

	}

	public void ClickOnGettinglate() {

		click(ButtonGettinglateiconbutton, "Click on Getting late Button");

	}

	public boolean GetDriverLateicon() {

		return Lateicon.isDisplayed();

	}

	public boolean GetHeadingtext() {

		return TextHeading.isDisplayed();

	}

	public void ClickOnBackCrossbutton() {

		click(CrossBackButton, "Click on Back cross Button");

	}

	public String GetDetails1text() {

		return getText(Text2ndDesc);

	}

	public String GetDetails2text() {

		return getText(TextPickupAddress);

	}
	public void ClickOn5minwait() {

		click(Wait5minsbox, "Click on 5 mins wait Button");

	}
	public void ClickOn10minwait() {

		click(Wait10minsbox, "Click on 10 mins wait Button");

	}
	public void ClickOn15minwait() {

		click(Wait15minsbox, "Click on 15 mins wait Button");

	}
	public void ClickOn20minwait() {

		click(Wait20minsbox, "Click on 20 mins wait Button");

	}
	public boolean checkButtoncontinue() {

		return ButtonContinue.isDisplayed();

	}
	public void ClickOnContinueButton() {

		click(ButtonContinue, "Click on continue Button");

	}


}
