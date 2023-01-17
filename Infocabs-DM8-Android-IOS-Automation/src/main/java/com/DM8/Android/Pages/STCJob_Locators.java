package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class STCJob_Locators extends ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public STCJob_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement ButtonAccept;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/rl_sumup_card_payment")
	WebElement ButtonCardPayment;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/image_ccVisa")
	WebElement CheckForVisaCard;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/image_ccMastercard")
	WebElement CheckForMasterCard;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/image_ccAmericanExpress")
	WebElement CheckForAmericanExpress;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/text_surcharge")
	WebElement CheckForSurCharge;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/button_pay")
	WebElement CheckForPaybuttontext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/button_cancel")
	WebElement CheckForCancelbuttontext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_credit_card")
	WebElement ButtonQRCodepayment;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_heading")
	WebElement CheckQRCodetext;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/idIVQrcode")
	WebElement CheckQRCodeArea;

	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_close")
	WebElement CloseButtonandText;

	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");

	}

	public void ClickOnCardPayment() {

		click(ButtonCardPayment, "Click Card Payment Button");

	}

	public void ClickOnQRCodeButton() {

		click(ButtonQRCodepayment, "Click on Card QR Code payment Button");

	}

	public boolean CheckCardIconbutton() {
		return ButtonCardPayment.isDisplayed();
	}

	public boolean CheckQRCodeIconbutton() {
		return ButtonQRCodepayment.isDisplayed();
	}

	public boolean CheckVisaIcon() {
		return CheckForVisaCard.isDisplayed();
	}

	public boolean CheckMasterIcon() {
		return CheckForMasterCard.isDisplayed();
	}

	public boolean CheckAmericanExpressIcon() {
		return CheckForAmericanExpress.isDisplayed();
	}

	public boolean GetForSurchargetext() {

		return CheckForSurCharge.isDisplayed();

	}

	public boolean GetForpaybuttontext() {

	
		return CheckForPaybuttontext.isDisplayed();

	}

	public String GetForCancelbuttontext() {

		return getText(CheckForCancelbuttontext);

	}

	public void ClickOnCnacleButton() {

		click(CheckForCancelbuttontext, "Click on Card cancel payment Button");

	}

	public String GetForQRCodetext() {

		return getText(CheckQRCodetext);

	}

	public boolean CheckForQRCodeArea() {
		return CheckQRCodeArea.isDisplayed();
	}

	public String GetForClosetext() {

		return getText(CloseButtonandText);

	}

	public void ClickOnCloseButton() {

		click(CloseButtonandText, "Click on close Button");

	}

}
