package com.DM8.Android.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class STCJob_Locators  extends ScreenActions  {
	
	
	
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
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/icon_credit_card")
	WebElement ButtonQRCodepayment;
	
	
	
	
	public void ClickOnAccept() {

		click(ButtonAccept, "Click on Login Button");

	}
	
	public void ClickOnCardPayment() {

		click(ButtonCardPayment, "Click Card Payment Button");

	}
	
	public void ClickOnQRCodeButton() {

		click(ButtonQRCodepayment, "Click on Card QR Code payment Button");

	}
	
	

}
