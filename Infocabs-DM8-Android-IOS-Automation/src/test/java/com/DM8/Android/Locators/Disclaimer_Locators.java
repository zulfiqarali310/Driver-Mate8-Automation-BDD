package com.DM8.Android.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DM8.Common.ScreenActions;
import com.DM8.Common.Utility;

import io.appium.java_client.AppiumDriver;

public class Disclaimer_Locators extends ScreenActions{
	
	AppiumDriver driver;
	Utility util = new Utility();

	public Disclaimer_Locators(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_started")
	WebElement TextStarted;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_instruction")
	WebElement TextInstruction;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/txt_heading")
	WebElement Textheading;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/webview")
	WebElement Textwebview;
	
	@FindBy(how = How.ID, using = "com.infocabs.DM8:id/btn_accept")
	WebElement AcceptButton;
	
	
	public void ClickOnAccept() {

		click(AcceptButton, "Click on Login Button");

	}

}
