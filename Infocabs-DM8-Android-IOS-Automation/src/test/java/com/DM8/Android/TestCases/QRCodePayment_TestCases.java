package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.POBJob_Locators;
import com.DM8.Android.Pages.STCJob_Locators;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class QRCodePayment_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	POBJob_Locators POBjob = new POBJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	STCJob_Locators STCjob = new STCJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);
	JSONObject BodyData = Utility.JobCreationforQRCode();
	
	
	
	private BufferedImage generateImage(WebElement element, File screenshot)
			 throws IOException {
			    BufferedImage fullImage = ImageIO.read(screenshot);

			    Point imageLocation = element.getLocation();

			    int qrCodeImageWidth = element.getSize().getWidth();

			    int qrCodeImageHeight = element.getSize().getHeight();

			    int pointXPosition = imageLocation.getX();

			    int pointYPosition = imageLocation.getY();

			    BufferedImage qrCodeImage = fullImage.getSubimage(pointXPosition, 
			                pointYPosition, qrCodeImageWidth, qrCodeImageHeight);

			    ImageIO.write(qrCodeImage, "png", screenshot);

			    return qrCodeImage;

			}
	
	private static String decodeQRCode(BufferedImage qrCodeImage) throws
	 NotFoundException, Throwable {
	    LuminanceSource source = new BufferedImageLuminanceSource(qrCodeImage);
	    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

	    Result result = new MultiFormatReader().decode(bitmap);
	    return result.getText();
	}
	
	
	
	
	@Given("^Job request are given for QR Code payment$")
    public void job_request_are_given_for_qr_code_payment() throws Throwable {
        Utility.waitForPageLoaded();

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
		System.out.println("Access Token are this " + response.path("Content.Status"));

    }

    @When("^Job request are send to the server for QR Code Payment with \"([^\"]*)\" mobile number$")
    public void job_request_are_send_to_the_server_for_qr_code_payment_with_something_mobile_number(String mobilenum) throws Throwable {
    	Utility.waitForPageLoaded();
    }

    @Then("^new job has been created to Verify QR Code payment$")
    public void new_job_has_been_created_to_verify_qr_code_payment() throws Throwable {
    	Utility.waitForPageLoaded();
    }
    
    
    
    @Given("^Job has been received on DM8 and move to STC status for QR Code Payment$")
    public void job_has_been_received_on_dm8_and_move_to_stc_status_for_qr_code_payment() throws Throwable {
    	Utility.waitForPageLoaded();
    }

    @When("^Accept job and move to STC so that payment can be made on QR Code$")
    public void accept_job_and_move_to_stc_so_that_payment_can_be_made_on_qr_code() throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Waitjob.ClickOnAccept();
    }

    @Then("^Job status should be in STC so that QR Code button should be visible$")
    public void job_status_should_be_in_stc_so_that_qr_code_button_should_be_visible() throws Throwable {
    	Utility.waitForPageLoaded();
    	
  
    }
    
    
    
    /*public void readQRCode() throws Throwable {

    
    	WebElement qrCodeElement = driver.findElement(By.id("com.infocabs.DM8:id/idIVQrcode"));

    	   File screenshot = driver.getScreenshotAs(OutputType.FILE);



    	   String content = decodeQRCode(generateImage(qrCodeElement, screenshot));

    	   System.out.println("content = " + content);

    	}*/

    
    @Given("^QR Code button are avaible on STC screen$")
    public void qr_code_button_are_avaible_on_stc_screen() throws Throwable {
    	Utility.waitForPageLoaded();
    }

    @When("^Click on QR Code button on for payment$")
    public void click_on_qr_code_button_on_for_payment() throws Throwable {
    	Utility.waitForPageLoaded();
		STCjob.ClickOnQRCodeButton();
		Thread.sleep(3000);
		
		WebElement qrCodeElement = driver.findElement(By.id("com.infocabs.DM8:id/idIVQrcode"));

	  	   File screenshot = driver.getScreenshotAs(OutputType.FILE);



	  	   String content = decodeQRCode(generateImage(qrCodeElement, screenshot));
	  	 System.out.println("content can be visible for action = " + content);
	  	 Thread.sleep(2000);
	  	   
	  	 //UiAutomator2Options options = new UiAutomator2Options();
	  	//options.setAppActivity("com.android.chrome");
	  	//options.setAppPackage("com.google.android.apps.chrome.Main");
	  	//Activity activity = new Activity("com.android.chrome", "com.google.android.apps.chrome.Main");
	 
	  	
		//String appPackage= ("com.uc.browser.en");
		String appPackage= ("com.android.chrome");
		//String appActivity=("com.uc.browser.ActivityBrowser");
		String appActivity=("org.chromium.chrome.browser.ChromeTabbedActivity");
		//driver.startActivity(new Activity(appPackage, appActivity));
		
		 ((AndroidDriver) driver).startActivity(new Activity(appPackage, appActivity));
		 
		 driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
	  	driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys(content);
	  	
	  	
	  	((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	  	//driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys(Keys.RETURN);

    
	  	
		 
	     //activity.setWaitAppPackage("app wait package goes here");
	     //activity.setWaitAppActivity("app wait activity goes here");
	     //driver.getAppActivity(activity);

	  	   System.out.println("content can be visible for action = " + content);
	  	 
	  	 
	  	   driver.findElement(By.xpath("//android.view.View[@text='**** **** **** 8710']")).click();
	  	   //driver.findElement(By.id("Cards"));
	  	 Utility.waitForPageLoaded();
	  	 
		 ((AndroidDriver) driver).activateApp("com.infocabs.DM8");
	  	 Utility.waitForPageLoaded();
			STCjob.ClickOnCloseButton();
			Thread.sleep(2000);
			Utility.waitForPageLoaded();
			Thread.sleep(1000);
			Acpjob.ClickOnAccept();
			Utility.waitForPageLoaded();
			Thread.sleep(1000);
			fd.ClickOnSubmit();
	  	
			((AndroidDriver) driver).activateApp("com.android.chrome");
			Thread.sleep(3000);
	  	   //driver.findElement(By.id("cardcvv")).sendKeys("123");
	  	   //driver.findElement(By.cssSelector("#cardcvv")).sendKeys("123");
	  	   //driver.findElement(By.id("pay-now")).click();
	  	   //driver.get(content);
	  	   
	  	 WebElement ele = driver.findElement(By.id("cardcvv"));
	  	 Utility.presenceOfElement(ele);
	  
	  	Thread.sleep(3000);
	  	 //WebDriverWait wait = new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("cardcvv")));
	  	   ele.sendKeys("123");
	     
	        driver.findElement(By.xpath("//*[@id='icon' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]")).click();
	  	

	  	 Thread.sleep(2000);
	  	 /*((AndroidDriver) driver).activateApp("com.infocabs.DM8");
	  	 Utility.waitForPageLoaded();
			STCjob.ClickOnCloseButton();
			Thread.sleep(2000);
			Utility.waitForPageLoaded();
			Thread.sleep(1000);
			Acpjob.ClickOnAccept();
			Utility.waitForPageLoaded();
			Thread.sleep(1000);
			fd.ClickOnSubmit();*/
    }

 
    @And("^click on clear and submit button so that QR Code payment successed$")
    public void click_on_clear_and_submit_button_so_that_qr_code_payment_successed() throws Throwable {
    	Utility.waitForPageLoaded();
		Thread.sleep(1000);
		/*Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		fd.ClickOnSubmit();*/
    }

    @Then("^payment can be made$")
    public void payment_can_be_made() throws Throwable {
    	Utility.waitForPageLoaded();
    }

    
    

	
	

}