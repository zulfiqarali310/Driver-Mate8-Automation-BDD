package com.DM8.Android.TestCases;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.DM8.Android.Pages.AcceptedJobPage;
import com.DM8.Android.Pages.FeedbackJob_Locators;
import com.DM8.Android.Pages.IncomingJobPage;
import com.DM8.Android.Pages.WaitingJob_Locators;
import com.DM8.Common.BaseClass;
import com.DM8.Common.Utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class DriversMessages_TestCases extends BaseClass {

	Utility util = new Utility();
	IncomingJobPage Injob = new IncomingJobPage(driver);
	AcceptedJobPage Acpjob = new AcceptedJobPage(driver);
	WaitingJob_Locators Waitjob = new WaitingJob_Locators(driver);
	FeedbackJob_Locators fd = new FeedbackJob_Locators(driver);
	TouchAction touch = new TouchAction((PerformsTouchActions) driver);

	@Given("^Job request are given for Drivers Messages alert verification$")
	public void job_request_are_given_for_drivers_messages_alert_verification() throws Throwable {
		Utility.waitForPageLoaded();

		JSONObject BodyData = Utility.JobCreation();
		Response response = given().header("Content-type", "application/json").and().body(BodyData.toString()).log()
				.all().when().post(prop.getProperty("JobCreatedAPI"));

		System.out.println("Access Token are this " + response.asString());
	}

	@When("^Job request are send to the server for Drivers messages verification$")
	public void job_request_are_send_to_the_server_for_drivers_messages_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@Then("^new job has been created in order to check and verify Drivers Messages in throughout job status$")
	public void new_job_has_been_created_in_order_to_check_and_verify_drivers_messages_in_throughout_job_status()
			throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job has been received on DM8 and Accept it for Drivers Messages verifications$")
	public void job_has_been_received_on_dm8_and_accept_it_for_drivers_messages_verifications() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
		Injob.ClickOnAccept();
	}

	@When("^click on message icon chat button on Accepted screen$")
	public void click_on_message_icon_chat_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^check Message whole alerts on Accepted screen$")
	public void check_message_whole_alerts_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check alerttitle \"([^\"]*)\" text on Accepted screen$")
	public void check_alerttitle_something_text_on_accepted_screen(String msg) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, msg);
	}

	@And("^click message chat icon button for second time on Accepted screen$")
	public void click_message_chat_icon_button_for_second_time_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^chech to verify message area on Accepted screen$")
	public void chech_to_verify_message_area_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);

	}

	@And("^check to verify cancle \"([^\"]*)\" button text Accepted screen$")
	public void check_to_verify_cancle_something_button_text_accepted_screen(String cnle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnle);
	}

	@And("^check to verify send \"([^\"]*)\" button text on Accepted screen$")
	public void check_to_verify_send_something_button_text_on_accepted_screen(String send) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, send);
	}

	@And("^click message chat icon to send message on Accepted screen$")
	public void cliceck_message_chat_icon_to_send_message_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^click on message button on Accepted screen$")
	public void click_on_message_button_on_accepted_screen() throws Throwable {	
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
		//Select listbox = new Select(driver.findElement(By.id("ndroid:id/text1")));
		//listbox.selectByIndex(0);
	}

	@And("^click on send button button on Accepted screen$")
	public void click_on_send_button_button_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^click on move job to waiting status for Chat message verification$")
	public void click_on_move_job_to_waiting_status_for_chat_message_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Acpjob.ClickOnAccept();
	}

	@Then("^All UI and text are verified on Accepted screen$")
	public void all_ui_and_text_are_verified_on_accepted_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in waiting status$")
	public void job_are_in_waiting_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on message icon chat button on Waiting screen$")
	public void click_on_message_icon_chat_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^check Message whole alerts on Waiting screen$")
	public void check_message_whole_alerts_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check alerttitle \"([^\"]*)\" text on Waiting screen$")
	public void check_alerttitle_something_text_on_waiting_screen(String msg) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, msg);
	}

	@And("^click message chat icon button for second time on Waiting screen$")
	public void click_message_chat_icon_button_for_second_time_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^chech to verify message area on Waiting screen$")
	public void chech_to_verify_message_area_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify cancle \"([^\"]*)\" button text Waiting screen$")
	public void check_to_verify_cancle_something_button_text_waiting_screen(String cnle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnle);
	}

	@And("^check to verify send \"([^\"]*)\" button text on Waiting screen$")
	public void check_to_verify_send_something_button_text_on_waiting_screen(String send) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, send);
	}

	@And("^click message chat icon to send message on Waiting screen$")
	public void click_message_chat_icon_to_send_message_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^click on message button on Waiting screen$")
	public void click_on_message_button_on_waiting_screen() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
		//Select listbox = new Select(driver.findElement(By.id("ndroid:id/text1")));
		//listbox.selectByIndex(0);
	}

	@And("^click on send button button on Waiting screen$")
	public void click_on_send_button_button_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^click on move job to pob status for Chat message verification$")
	public void click_on_move_job_to_pob_status_for_chat_message_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Acpjob.ClickOnAccept();
	}

	@Then("^All UI and text are verified on Waiting screen$")
	public void all_ui_and_text_are_verified_on_waiting_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in pob status$")
	public void job_are_in_pob_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on message icon chat button on POB screen$")
	public void click_on_message_icon_chat_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^check Message whole alerts on POB screen$")
	public void check_message_whole_alerts_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check alerttitle \"([^\"]*)\" text on POB screen$")
	public void check_alerttitle_something_text_on_pob_screen(String msg) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, msg);
	}

	@And("^click message chat icon button for second time on POB screen$")
	public void check_message_chat_icon_button_for_second_time_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^chech to verify message area on POB screen$")
	public void chech_to_verify_message_area_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify cancle \"([^\"]*)\" button text POB screen$")
	public void check_to_verify_cancle_something_button_text_pob_screen(String cnle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnle);
	}

	@And("^check to verify send \"([^\"]*)\" button text on POB screen$")
	public void check_to_verify_send_something_button_text_on_pob_screen(String send) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, send);
	}

	@And("^click message chat icon to send message on POB screen$")
	public void click_message_chat_icon_to_send_message_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^click on message button on POB screen$")
	public void click_on_message_button_on_pob_screen() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
		//Select listbox = new Select(driver.findElement(By.id("ndroid:id/text1")));
		//listbox.selectByIndex(0);
	}

	@And("^click on send button button on POB screen$")
	public void click_on_send_button_button_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^click on move job to stc status for Chat message verification$")
	public void click_on_move_job_to_stc_status_for_chat_message_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Acpjob.ClickOnAccept();
	}

	@Then("^All UI and text are verified on POB screen$")
	public void all_ui_and_text_are_verified_on_pob_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in stc status$")
	public void job_are_in_stc_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on message icon chat button on STC screen$")
	public void click_on_message_icon_chat_button_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^check Message whole alerts on STC screen$")
	public void check_message_whole_alerts_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check alerttitle \"([^\"]*)\" text on STC screen$")
	public void check_alerttitle_something_text_on_stc_screen(String msg) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, msg);
	}

	@And("^click message chat icon button for second time on STC screen$")
	public void click_message_chat_icon_button_for_second_time_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^chech to verify message area on STC screen$")
	public void chech_to_verify_message_area_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify cancle \"([^\"]*)\" button text STC screen$")
	public void check_to_verify_cancle_something_button_text_stc_screen(String cnle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnle);
	}

	@And("^check to verify send \"([^\"]*)\" button text on STC screen$")
	public void check_to_verify_send_something_button_text_on_stc_screen(String send) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, send);
	}

	@And("^click message chat icon to send message on STC screen$")
	public void click_message_chat_icon_to_send_message_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^click on message button on STC screen$")
	public void click_on_message_button_on_stc_screen() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
		//Select listbox = new Select(driver.findElement(By.id("ndroid:id/text1")));
		//listbox.selectByIndex(0);
	}

	@And("^click on send button button on STC screen$")
	public void click_on_send_button_button_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^click on move job to clear status for Chat message verification$")
	public void click_on_move_job_to_clear_status_for_chat_message_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		Acpjob.ClickOnAccept();
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		fd.ClickOnSubmit();
	}

	@Then("^All UI and text are verified on STC screen$")
	public void all_ui_and_text_are_verified_on_stc_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

	@Given("^Job are in clear status$")
	public void job_are_in_clear_status() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(1000);
	}

	@When("^click on message icon chat button on Clear screen$")
	public void click_on_message_icon_chat_button_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^check Message whole alerts on Clear screen$")
	public void check_message_whole_alerts_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkforwholechatAlert();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check alerttitle \"([^\"]*)\" text on Clear screen$")
	public void check_alerttitle_something_text_on_clear_screen(String msg) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforMessagetext();
		Assert.assertEquals(Actualtext, msg);
	}

	@And("^click message chat icon button for second time on Clear screen$")
	public void click_message_chat_icon_button_for_second_time_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^chech to verify message area on Clear screen$")
	public void chech_to_verify_message_area_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		boolean Actualtext = Acpjob.checkformessageare();
		boolean expected = true;
		Assert.assertEquals(Actualtext, expected);
	}

	@And("^check to verify cancle \"([^\"]*)\" button text Clear screen$")
	public void check_to_verify_cancle_something_button_text_clear_screen(String cnle) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.Getforcanclebuttontext();
		Assert.assertEquals(Actualtext, cnle);
	}

	@And("^check to verify send \"([^\"]*)\" button text on Clear screen$")
	public void check_to_verify_send_something_button_text_on_clear_screen(String send) throws Throwable {
		Utility.waitForPageLoaded();
		String Actualtext = Acpjob.GetforSendbuttontext();
		Assert.assertEquals(Actualtext, send);
	}

	@And("^click message chat icon to send message on Clear screen$")
	public void click_message_chat_icon_to_send_message_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnGettingLateChatButton();
	}

	@And("^click on message button on Clear screen$")
	public void click_on_message_button_on_clear_screen() throws Throwable {
		Thread.sleep(2000);
		Acpjob.ClickOnAnyMessageButton();
		//Select listbox = new Select(driver.findElement(By.id("ndroid:id/text1")));
		//listbox.selectByIndex(0);
	}

	@And("^click on send button button on Clear screen$")
	public void click_on_send_button_button_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(3000);
		Acpjob.ClickOnSendButtob();
	}

	@And("^click on move job to Feedback status for Chat message verification$")
	public void click_on_move_job_to_feedback_status_for_chat_message_verification() throws Throwable {
		Utility.waitForPageLoaded();
		Thread.sleep(2000);
		fd.ClickOnSubmit();
	}

	@Then("^All UI and text are verified on Clear screen$")
	public void all_ui_and_text_are_verified_on_clear_screen() throws Throwable {
		Utility.waitForPageLoaded();
	}

}
