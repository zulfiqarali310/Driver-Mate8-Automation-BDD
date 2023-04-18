package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class LoginPage extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/iv_more")
	WebElement MoreButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/change_code")
	WebElement ChangeButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/forgot_password")
	WebElement RequestPasswordResetButton;
	
	

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_started")
	WebElement TextStarted;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_instruction")
	WebElement TextInstruction;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/edt_code")
	WebElement EditCode;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_register")
	WebElement ButtonRegister;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/dialog_message")
	WebElement GetErrorMessage;
	
	
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/listItems")
	WebElement Clickonusernamefiled1;
	
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_heading1")
	WebElement ChangePasswordAlertDetails;
	
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_continue")
	WebElement ClickOncontineButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_negative")
	WebElement ClickOnOKButton;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/edt_email")
	WebElement EnterUsername;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/edt_password")
	WebElement EnterPassword;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_login")
	WebElement LoginButton;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/cbRememberMe")
	WebElement Rememberme;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_version")
	WebElement AppVersion;

	public void ClickOnMoreButton() {

		click(MoreButton, "Click on Login Button");

	}
	
	public void ClickOChangeButton() {

		click(ChangeButton, "Click on Login Button");

	}
	
	public void ClickOnRequestPasswordButton() {

		click(RequestPasswordResetButton, "Click on Login Button");

	}
	
	public void ClickOncontineButton() {

		click(ClickOncontineButton, "Click on contine Button");

	}
	
	public void ClickOnUsernamefield() {

		click(Clickonusernamefiled1, "Click on Select username");

	}
	
	
	

	public void WriteCode(String code) {

		sendKeys(EditCode, code, "Login with Driver Code" + code);
	}

	public void ClickOnRegister() {

		click(ButtonRegister, "Click on Login Button");

	}
	
	public void ClearDriverCodeArea() {
		EditCode.clear();
	}

	public void EnterUsername(String uname) {

		sendKeys(EnterUsername, uname, "Enter Username" + uname);
	}
	
	public String VerifyGetUsername() {

		return getText(EnterUsername);
	}
	
	
	
	public void ClearUsernameArea() {
		EnterUsername.clear();
	}

	public void EnterPassword(String pwd) {

		sendKeys(EnterPassword, pwd, "Enter Password" + pwd);
	}
	
	public boolean VerifyGetPassword() {
		return EnterPassword.isDisplayed();
	}
	
	public void ClearPasswordArea() {
		EnterPassword.clear();
	}

	public void ClickOnLoginrButton() {

		click(LoginButton, "Click on Login Button");

	}
	
	public void ClickOnOKButton() {

		click(ClickOnOKButton, "Click on Alert Ok Button");

	}
	
	public String GetStartedText() {

		return getText(TextStarted);
	}

	public String GetChangePassworddetailsText() {

		return getText(ChangePasswordAlertDetails);
	}
	
	public String GetErrorMessageText() {

		return getText(GetErrorMessage);
	}

	public String GetInstructionText() {

		return getText(TextInstruction);
	}

	public String GetRemembermeText() {

		return getText(Rememberme);
	}
	
	public void ClickONRemmberMeTickBox() {

		click(Rememberme, "Click on Remmber me Tickbox");

	}

}
