package com.DM8.Common;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public void clear(WebElement e) {
		Utility.waitForElementToBeVisible(e);
		e.clear();
	}

	public void click(WebElement e) {
		Utility.waitForElementToBeVisible(e);
		e.click();
	}

	public void click(WebElement e, String msg) {
		Utility.waitForElementToBeVisible(e);
		util.log().info(msg);
		e.click();
	}

	public void sendKeys(WebElement e, String txt) {
		Utility.waitForElementToBeVisible(e);
		e.sendKeys(txt);
	}

	public void sendKeys(WebElement e, String txt, String msg) {
		Utility.waitForElementToBeVisible(e);
		util.log().info(msg);
		e.sendKeys(txt);
	}

	public String getAttribute(WebElement e, String attribute) {
		Utility.waitForElementToBeVisible(e);
		return e.getAttribute(attribute);
	}
	
	public String getText(WebElement e) {
		Utility.waitForElementToBeVisible(e);
		return e.getText();
	}

}
