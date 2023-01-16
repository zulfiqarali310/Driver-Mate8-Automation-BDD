package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class POBJob_Locators extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public POBJob_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement ButtonAccept;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_start_waiting")
	WebElement ButtonStartStopWaiting;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_start_meter")
	WebElement ButtonStartStopMeter;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_menu_extraCharges")
	WebElement ButtonAddExtraCharges;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/custom")
	WebElement ExtraFieldsinputarea;
	
	

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/rl_change_dropoff")
	WebElement ButtonChangeDropoffAddress;
	@FindBy(how = How.ID, using = "android:id/message")
	WebElement AddExtraAlertTitilemessage;
	

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_change_dropoff")
	WebElement DropoffAdresstext;

	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");

	}

	public void ClickOnStartStopWaiting() {

		click(ButtonStartStopWaiting, "Click on Start and Stop waiting Button");

	}

	public String GetStartStopWaitingtext() {

		return getText(ButtonStartStopWaiting);

	}

	public void ClickOnStartStopMeter() {

		click(ButtonStartStopMeter, "Click on Start and Stop Meter Button");

	}

	public String GetStartStopMetertext() {

		return getText(ButtonStartStopMeter);

	}

	public void ClickOnAddExtraCharges() {

		click(ButtonAddExtraCharges, "Click on Add Extra Charges button");

	}

	public String GetExtraButtontext() {

		return getText(ButtonAddExtraCharges);

	}

	public void ClickOnChangeDropoffAddress() {

		click(ButtonChangeDropoffAddress, "Click on Change Dropoff Address button button");

	}

	public String GetDrooffAddresstext() {

		return getText(DropoffAdresstext);

	}
	
	public String GetExtraAlerttext() {

		return getText(AddExtraAlertTitilemessage);

	}
	
	public boolean checkforwholeinputarea() {

		return ExtraFieldsinputarea.isDisplayed();

	}
	
	public void Entereuro(String inpteuro) {

		sendKeys(ExtraFieldsinputarea, inpteuro, "enter number value" + inpteuro);
	}

}
