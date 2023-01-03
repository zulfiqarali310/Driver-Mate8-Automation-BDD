package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import java.time.Clock;
import java.time.Instant;

import org.json.JSONArray;
import org.json.JSONObject;

import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class RejectJob_TestCases extends BaseClass {

	IncomingJobPage Injob = new IncomingJobPage(driver);
	Utility util = new Utility();

	@Given("^Job request are given$")
	public void job_request_are_given() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(4000);
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

		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		// JsonPath extractor = response.jsonPath();
		// System.out.println(extractor);
		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server$")
	public void job_request_are_send_to_the_server() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
	}

	@Then("^new job has been created in order to reject it from driver App$")
	public void new_job_has_been_created_in_order_to_reject_it_from_driver_app() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8$")
	public void job_has_been_received_on_dm8() throws Throwable {
		Thread.sleep(2000);
		Utility.waitForPageLoaded();

	}

	@When("^click on Reject button$")
	public void click_on_reject_button() throws Throwable {
		Utility.waitForPageLoaded();
		Injob.ClickOnRejected();
		Thread.sleep(2000);
	}

	@Then("^job has beeen reject from the Driver$")
	public void job_has_beeen_reject_from_the_driver() throws Throwable {
		Utility.waitForPageLoaded();
	}

}
