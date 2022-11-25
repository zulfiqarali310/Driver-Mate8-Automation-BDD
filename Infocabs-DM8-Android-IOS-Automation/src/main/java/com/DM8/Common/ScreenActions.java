package com.DM8.Common;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ScreenActions {

	AppiumDriver driver;
	Utility util = new Utility();

	public void clear(WebElement e) {
		util.waitForElementToBeVisible(e);
		e.clear();
	}

	public void click(WebElement e) {
		util.waitForElementToBeClickable(e);

		e.click();
	}

	public void click(WebElement e, String msg) {
		util.waitForElementToBeClickable(e);
		util.log().info(msg);
		e.click();
	}

	public void sendKeys(WebElement e, String txt) {
		util.waitForElementToBeVisible(e);
		e.sendKeys(txt);
	}

	public void sendKeys(WebElement e, String txt, String msg) {
		util.waitForElementToBeVisible(e);
		util.log().info(msg);
		e.sendKeys(txt);
	}

	public String getAttribute(WebElement e, String attribute) {
		util.waitForElementToBeVisible(e);
		return e.getAttribute(attribute);
	}

}
