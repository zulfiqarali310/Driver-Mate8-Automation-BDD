package com.DM8.Common;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

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
	
	
	public void swipe(int startX, int startY, int endX, int endY, int millis)
		      throws InterruptedException {
		   
			TouchAction text = new TouchAction((PerformsTouchActions) driver);
		    text.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
		        .perform();
		    
		    
		  }
	
	 //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        TouchAction t = new TouchAction((PerformsTouchActions)driver)
            .press(point(anchor, startPoint))
            .waitAction(waitOptions(ofMillis(1000)))
            .moveTo(point(anchor, endPoint))
            .release().perform();
    }

}
