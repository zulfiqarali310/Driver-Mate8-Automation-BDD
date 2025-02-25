package com.DM8.Common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.appium.java_client.AppiumDriver;

public class Utility extends BaseClass {

	// public static final long WAIT = 20;

	public static String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException {

		File screenshotLocation = null;
		try {
			System.out.println("Driver from On screenshot : " + driver);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			screenshotLocation = new File(
					System.getProperty("user.dir") + "//Reports//ExtentReports//screenshots//" + testCaseName + ".png");
			FileUtils.copyFile(scrFile, screenshotLocation);
			System.out.println(screenshotLocation.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshotLocation.toString();
	}

	public static String getScreenshotName(String methodName) {
		Date d = new Date();
		String fileName = methodName + "_" + d.toString().replace(":", "_").replace(" ", "_") + ".png";
		return fileName;
	}

	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public Logger log() {
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}

	public void waitForElementToAppear(WebElement ele, AppiumDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.attributeContains((ele), "text", "Cart"));
	}

	public static void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		try {
			Thread.sleep(2000);
			wait.until(expectation);
		} catch (Throwable error) {
			// Reporter.log("Timeout waiting for Page Load Request to complete.");
		}
	}

	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementsVisibility(List<WebElement> searchResults) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));
	}

	public static boolean presenceOfElement(WebElement element) {
		boolean bPresent;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.isDisplayed();
			bPresent = true;
		} catch (NoSuchElementException e) {
			bPresent = false;
		}
		return bPresent;
	}

	public void fluentWait(WebDriver driver, WebElement element, int timeOut) {
		Wait<WebDriver> wait = null;
		try {
			wait = new FluentWait<WebDriver>((WebDriver) driver).withTimeout(Duration.ofSeconds(60))
					.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
		}
	}

	public static JSONObject JobCreation() {

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		CustData.put("custId", 526);
		CustData.put("custCallingNo", 100);
		CustData.put("companyId", 15);
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", prop.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("minimumPrice", 300);
		FareInfoData.put("bookingFee", 2);
		FareInfoData.put("jobPrice", 15.8);
		FareInfoData.put("totalPrice", 17.8);
		FareInfoData.put("driverCost", 15.8);
		FareInfoData.put("fareType", "Meter");
		FareInfoData.put("appliedTariffID", 99);
		FareInfoData.put("appliedTariffName", "Default BF");
		FareInfoData.put("mileage", 5.23);
		FareInfoData.put("paymentMethod", "Cash");
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", "BRADLEY PARK GOLF COURSEBRADLEY ROADHUDDERSFIELD");
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", "53.681745450474500");
		PickUpLatLong.put("longitude", "-1.760221227131600");
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", "12SCOUT HILL TERRACEDEWSBURY");
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", "53.681725522110900");
		DropoffLatLong.put("longitude", "-1.649835636900800");
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		// LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		BodyData.put("totalMiles", "5.23");
		BodyData.put("DivisionMask", 1073741824);
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", 15);
		BodyData.put("jobType", 4);
		BodyData.put("operatorID", 1033);
		BodyData.put("isFeatureEnable", true);

		return BodyData;

	}
	
	
	public static JSONObject JobCreationforQRCode() {

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		CustData.put("custId", 526);
		CustData.put("custCallingNo", prop.getProperty("CustomerQRCode_Calling_Num"));
		CustData.put("companyId", 15);
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", prop.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("minimumPrice", 300);
		FareInfoData.put("bookingFee", 2);
		FareInfoData.put("jobPrice", 15.8);
		FareInfoData.put("totalPrice", 17.8);
		FareInfoData.put("driverCost", 15.8);
		FareInfoData.put("fareType", "Meter");
		FareInfoData.put("appliedTariffID", 99);
		FareInfoData.put("appliedTariffName", "Default BF");
		FareInfoData.put("mileage", 5.23);
		FareInfoData.put("paymentMethod", "Cash");
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", "BRADLEY PARK GOLF COURSEBRADLEY ROADHUDDERSFIELD");
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", "53.681745450474500");
		PickUpLatLong.put("longitude", "-1.760221227131600");
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", "12SCOUT HILL TERRACEDEWSBURY");
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", "53.681725522110900");
		DropoffLatLong.put("longitude", "-1.649835636900800");
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		// LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		BodyData.put("totalMiles", "5.23");
		BodyData.put("DivisionMask", 1073741824);
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", 15);
		BodyData.put("jobType", 4);
		BodyData.put("operatorID", 1033);
		BodyData.put("isFeatureEnable", true);

		return BodyData;

	}
	
	
	public static JSONObject FixedFareVerification() {

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		
		CustData.put("custId", prop.getProperty("Customer_ID"));
		CustData.put("custCallingNo", prop.getProperty("Customer_Calling_Num"));	
		CustData.put("companyId", prop.getProperty("Company_ID"));
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", prop.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("surchargeCost", prop.getProperty("SurchargeCost"));
		FareInfoData.put("surchargePrice", prop.getProperty("SurchargePrice"));
		FareInfoData.put("companyCommission", prop.getProperty("CompanyComssion"));
		FareInfoData.put("waitTimeCharge", prop.getProperty("WaitingTimeCharge"));
		FareInfoData.put("minimumPrice", prop.getProperty("MinimumPrice"));
		FareInfoData.put("bookingFee", prop.getProperty("BookingFee"));
		FareInfoData.put("misc", prop.getProperty("Misc"));
		FareInfoData.put("discount", prop.getProperty("Discount"));
		FareInfoData.put("jobPrice", prop.getProperty("JobPrice"));
		FareInfoData.put("totalPrice", prop.getProperty("TotalPrice"));
		FareInfoData.put("driverCost", prop.getProperty("DriverCost"));
		FareInfoData.put("fareType", prop.getProperty("FareType"));
		FareInfoData.put("appliedTariffID", prop.getProperty("TariffID"));
		FareInfoData.put("appliedTariffName", prop.getProperty("TariffName"));
		FareInfoData.put("mileage", prop.getProperty("Mileage"));
		FareInfoData.put("paymentMethod", prop.getProperty("PaymentMethod"));
		
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", prop.getProperty("PickupAddress"));
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", prop.getProperty("PickUpLat"));
		PickUpLatLong.put("longitude", prop.getProperty("PickLong"));
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", prop.getProperty("DropoffAddress"));
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", prop.getProperty("DropoffLat"));
		DropoffLatLong.put("longitude", prop.getProperty("DropoffLong"));
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		// LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		
		BodyData.put("totalMiles", prop.getProperty("TotalMiles"));
		BodyData.put("DivisionMask", prop.getProperty("devisionMask"));
		BodyData.put("custId", prop.getProperty("Customer_ID"));
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", prop.getProperty("Company_ID"));
		BodyData.put("jobType", prop.getProperty("JobType"));
		BodyData.put("operatorID", prop.getProperty("OperatorID"));
		BodyData.put("isFeatureEnable", true);

		return BodyData;

	}
	
	
	public static JSONObject PreCalculatedFareVerification() {

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		
		CustData.put("custId", Datafile.getProperty("Customer_ID"));
		CustData.put("custCallingNo", Datafile.getProperty("Customer_Calling_Num"));	
		CustData.put("companyId", Datafile.getProperty("Company_ID"));
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", Datafile.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("surchargeCost", Datafile.getProperty("PSurchargeCost"));
		FareInfoData.put("surchargePrice", Datafile.getProperty("PSurchargePrice"));
		FareInfoData.put("companyCommission", Datafile.getProperty("PCompanyComssion"));
		FareInfoData.put("waitTimeCharge", Datafile.getProperty("PWaitingTimeCharge"));
		FareInfoData.put("minimumPrice", Datafile.getProperty("PMinimumPrice"));
		FareInfoData.put("bookingFee", Datafile.getProperty("PBookingFee"));
		FareInfoData.put("misc", Datafile.getProperty("PMisc"));
		FareInfoData.put("discount", Datafile.getProperty("PDiscount"));
		FareInfoData.put("jobPrice", Datafile.getProperty("PJobPrice"));
		FareInfoData.put("totalPrice", Datafile.getProperty("PTotalPrice"));
		FareInfoData.put("driverCost", Datafile.getProperty("PDriverCost"));
		FareInfoData.put("fareType", Datafile.getProperty("PFareType"));
		FareInfoData.put("appliedTariffID", Datafile.getProperty("PTariffID"));
		FareInfoData.put("appliedTariffName", Datafile.getProperty("PTariffName"));
		FareInfoData.put("mileage", Datafile.getProperty("PMileage"));
		FareInfoData.put("paymentMethod", Datafile.getProperty("PPaymentMethod"));
		
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", Datafile.getProperty("PPickupAddress"));
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", Datafile.getProperty("PPickUpLat"));
		PickUpLatLong.put("longitude", Datafile.getProperty("PPickLong"));
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", Datafile.getProperty("PDropoffAddress"));
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", Datafile.getProperty("PDropoffLat"));
		DropoffLatLong.put("longitude", Datafile.getProperty("PDropoffLong"));
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		// LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		
		BodyData.put("totalMiles", Datafile.getProperty("TotalMiles"));
		BodyData.put("DivisionMask", Datafile.getProperty("devisionMask"));
		BodyData.put("custId", Datafile.getProperty("Customer_ID"));
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", Datafile.getProperty("Company_ID"));
		BodyData.put("jobType", Datafile.getProperty("JobType"));
		BodyData.put("operatorID", Datafile.getProperty("OperatorID"));
		BodyData.put("isFeatureEnable", true);

		return BodyData;

	}
	
	public static JSONObject AccountJobVerification() {

		// Post Request Body Data
		JSONObject BodyData = new JSONObject();

		// 1st array
		JSONObject CustData = new JSONObject();
		BodyData.put("IsEvoAccountCustomerEnable", true);
		
		CustData.put("custId", Datafile.getProperty("ACustomID"));
		CustData.put("custName", Datafile.getProperty("ACustomerName"));
		CustData.put("custEmailId", Datafile.getProperty("ACus_Email"));
		CustData.put("custCallingNo", Datafile.getProperty("ACus_CallingNum"));	
		CustData.put("companyId", Datafile.getProperty("Company_ID"));
		// put 1st ArrayData
		BodyData.put("Customer", CustData);

		// 2nd Array for Dispatch Drivers
		JSONObject DispatchDvr = new JSONObject();
		DispatchDvr.put("driverId", Datafile.getProperty("DriverID"));

		// Array for Driver IDs
		JSONArray DvrAry1 = new JSONArray();
		DvrAry1.put(DispatchDvr);
		// put 2nd ArrayData
		BodyData.put("lst_JobDispatchInfo", DvrAry1);

		// 3rd Array for FareInfo
		JSONObject FareInfoData = new JSONObject();
		FareInfoData.put("surchargeCost", Datafile.getProperty("ASurchargeCost"));
		FareInfoData.put("surchargePrice", Datafile.getProperty("ASurchargePrice"));
		FareInfoData.put("companyCommission", Datafile.getProperty("ACompanyComssion"));
		FareInfoData.put("waitTimeCharge", Datafile.getProperty("AWaitingTimeCharge"));
		FareInfoData.put("minimumPrice", Datafile.getProperty("AMinimumPrice"));
		FareInfoData.put("bookingFee", Datafile.getProperty("ABookingFee"));
		FareInfoData.put("misc", Datafile.getProperty("AMisc"));
		FareInfoData.put("discount", Datafile.getProperty("ADiscount"));
		FareInfoData.put("jobPrice", Datafile.getProperty("AJobPrice"));
		FareInfoData.put("totalPrice", Datafile.getProperty("ATotalPrice"));
		FareInfoData.put("driverCost", Datafile.getProperty("ADriverCost"));
		FareInfoData.put("fareType", Datafile.getProperty("AFareType"));
		FareInfoData.put("appliedTariffID", Datafile.getProperty("ATariffID"));
		FareInfoData.put("appliedTariffName", Datafile.getProperty("ATariffName"));
		FareInfoData.put("mileage", Datafile.getProperty("AMileage"));
		FareInfoData.put("paymentMethod", Datafile.getProperty("APaymentMethod"));
		
		// put 3rd ArrayData
		BodyData.put("EvoFareInfo", FareInfoData);

		// 4rth Array for Locations
		JSONObject LocationData = new JSONObject();

		// PickUp Address
		JSONObject PickUpAddressData = new JSONObject();
		PickUpAddressData.put("place", Datafile.getProperty("PPickupAddress"));
		// PickUp Latlong Address
		JSONObject PickUpLatLong = new JSONObject();
		PickUpLatLong.put("latitude", Datafile.getProperty("PPickUpLat"));
		PickUpLatLong.put("longitude", Datafile.getProperty("PPickLong"));
		// Combine both Address name and lat/long
		PickUpAddressData.put("LatLong", PickUpLatLong);

		// DropOff Address
		JSONObject DropOffAddressData = new JSONObject();
		DropOffAddressData.put("place", Datafile.getProperty("PDropoffAddress"));
		// Dropoff Latlong Address
		JSONObject DropoffLatLong = new JSONObject();
		DropoffLatLong.put("latitude", Datafile.getProperty("PDropoffLat"));
		DropoffLatLong.put("longitude", Datafile.getProperty("PDropoffLong"));
		// Combine both Address name and lat/long
		DropOffAddressData.put("LatLong", DropoffLatLong);

		// Now Add both Pick and Dropoff Data
		LocationData.put("PickupAddress", PickUpAddressData);
		LocationData.put("DestinyAddress", DropOffAddressData);

		// Put 4th Array Data
		BodyData.put("Locations", LocationData);
		// LocalDateTime time = java.time.LocalDateTime.now();
		Instant time = Clock.systemUTC().instant();
		System.out.println(time);
		BodyData.put("journeyDateTime", time);
		
		BodyData.put("totalMiles", Datafile.getProperty("TotalMiles"));
		BodyData.put("DivisionMask", Datafile.getProperty("devisionMask"));
		BodyData.put("custId", Datafile.getProperty("Customer_ID"));
		BodyData.put("isEvoFareEnabled", true);
		BodyData.put("companyId", Datafile.getProperty("Company_ID"));
		BodyData.put("jobType", Datafile.getProperty("JobType"));
		BodyData.put("operatorID", Datafile.getProperty("OperatorID"));
		BodyData.put("accountUser", Datafile.getProperty("AaccountUser"));
		BodyData.put("acc_UserId", Datafile.getProperty("Aacc_UserId"));
		BodyData.put("isFeatureEnable", true);

		return BodyData;

	}
	
	
	


}
