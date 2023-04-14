package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class SplashesAndAnimation extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public SplashesAndAnimation(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement Allow_LocationButton;

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_message")
	private WebElement PermissionTxt;

	@FindBy(how = How.ID, using = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement Allow_PhoneCalls_Storage_Button;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/bg_main_top")
	private WebElement LogoImg;
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_welcome")
	WebElement WlcText;
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_lorem")
	WebElement detailTxt;
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/img_onboarding_main")
	private WebElement DM8IMG;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_already_have_account")
	WebElement AlreadyAccount;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_get_started")
	WebElement GetStartedButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_next")
	WebElement NextButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_skip")
	WebElement SkipButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_accept_a_job")
	WebElement AcceptjobDetailsTxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_already_have_account")
	WebElement AlreadAccountTxt;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_started")
	WebElement TextStarted;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_instruction")
	WebElement TextInstruction;

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

	public String GetWlcmText() {

		return getText(WlcText);
	}

	public String GetDetailText() {

		return getText(detailTxt);
	}

	public String GetSiginText() {

		return getText(AlreadyAccount);
	}

	public String GetSkipText() {

		return getText(SkipButton);
	}
	
	public void ClickOnSkipButton() {

		click(SkipButton);
	}

	public String GetDetailsText() {

		return getText(AcceptjobDetailsTxt);
	}

	public String GetAlreadyAccountText() {

		return getText(AlreadAccountTxt);
	}
	
	public void ClickOnAlreadyAccount() {

		click(AlreadAccountTxt);
	}

	public String GetStartedText() {

		return getText(TextStarted);
	}

	public String GetInstractionText() {

		return getText(TextInstruction);
	}

}
