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
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/sepp")
	WebElement clicktoScrollJButton;
	
	
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_person")
	WebElement Personicon;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_customer_name")
	WebElement Customername;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_getting_late")
	WebElement Gettinglateiconbutton;

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
		return Gettinglateiconbutton.isDisplayed();
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
	

}
