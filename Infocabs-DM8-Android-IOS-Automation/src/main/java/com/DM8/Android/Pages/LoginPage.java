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

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_started")
	WebElement TextStarted;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_instruction")
	WebElement TextInstruction;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/edt_code")
	WebElement EditCode;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_register")
	WebElement ButtonRegister;

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

	public void WriteCode(String code) {

		sendKeys(EditCode, code, "Login with Driver Code" + code);
	}

	public void ClickOnRegister() {

		click(ButtonRegister, "Click on Login Button");

	}

	public void EnterUsername(String uname) {

		sendKeys(EnterUsername, uname, "Enter Username" + uname);
	}

	public void EnterPassword(String pwd) {

		sendKeys(EnterPassword, pwd, "Enter Password" + pwd);
	}

	public void ClickOnLoginrButton() {

		click(LoginButton, "Click on Login Button");

	}

	public String GetStartedText() {

		return getText(TextStarted);
	}

	public String GetInstructionText() {

		return getText(TextInstruction);
	}

	public String GetRemembermeText() {

		return getText(Rememberme);
	}

}
