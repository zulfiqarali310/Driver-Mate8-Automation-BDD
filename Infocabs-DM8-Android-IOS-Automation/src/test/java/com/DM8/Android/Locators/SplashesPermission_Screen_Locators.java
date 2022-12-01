package com.DM8.Android.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class SplashesPermission_Screen_Locators extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public SplashesPermission_Screen_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement Allow_LocationButton;

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_message")
	private WebElement PermissionTxt;

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement Allow_PhoneCalls_Storage_Button;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_get_started")
	WebElement GetStartedButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_next")
	WebElement NextButton;

	public void AllowLocation() {

		click(Allow_LocationButton);
	}

	public void AllowStorageCalls() {

		click(Allow_PhoneCalls_Storage_Button);
	}
	
	public void GetStartedButton() {

		click(GetStartedButton);
	}
	
	public void NextButton_SplashScreen() {

		click(NextButton);
	}

}
