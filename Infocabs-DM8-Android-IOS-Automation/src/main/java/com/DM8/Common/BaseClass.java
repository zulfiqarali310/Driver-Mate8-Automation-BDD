package com.DM8.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public static AppiumDriverLocalService service;
	public static AppiumDriver driver;
	
	// borwserstack Properties
	 public static String userName1 = "zulfiqarali_Enik9H";
	  public static String accessKey2 = "uGhgqkKUHhCysnhAgZRk";
	  
	  // Pipeline properties
	  public static String userName = System.getenv("BROWSERSTACK_USERNAME");
	  public static String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
	  public static String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	  public static String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	  public static String app = System.getenv("BROWSERSTACK_APP_ID");

	static String UserDir = System.getProperty("user.dir");
	static String ApplicationPath = UserDir + "/Apps/Latest-DM8.apk";
	static File file = new File(UserDir + "/src/main/resources/config.properties");
	static FileInputStream fis = null;
	public static Properties prop = new Properties();
	static {
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static  void startAppiumServer() {

		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.usingAnyFreePort();
		builder.usingDriverExecutable(new File("/usr/local/bin/node"));
		builder.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
		HashMap<String, String> environment = new HashMap<String, String>();
		environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
		builder.withEnvironment(environment);
		service = AppiumDriverLocalService.buildService(builder);
		service.start();

	}


	public static void setAndroidCapabilities() {
		
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("device", "Samsung Galaxy S8");
		    caps.setCapability("app", app);
		    caps.setCapability("browserstack.local", browserstackLocal);
		    caps.setCapability("browserstack.localIdentifier", browserstackLocalIdentifier);

		

	    // use below when you want to run directly on the Browserstack
		/*
	    UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Google Pixel 3");
		options.setPlatformName("Android");
		options.setPlatformVersion("9.0");
		options.setApp("bs://0076ceee49c3008653233e133cb55329644812f7");
		options.setCapability("name", "Test1");*/
		
	
		// use below when you want to run it locally

		/*UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("Android_DeviceNames"));
		options.setPlatformName(prop.getProperty("Device_Type"));
		options.setUdid(prop.getProperty("Device_UDiD"));
		options.setPlatformVersion(prop.getProperty("Android_Version"));
		options.setApp(ApplicationPath);
		options.setAppPackage(prop.getProperty("App_package"));
		options.setAppActivity(prop.getProperty("App_Activity"));
		//options.headless();
		//options.setCapability("isHeadless", true);
		// options.setAutoGrantPermissions(true);
		// options.setCapability("autoAcceptAlerts", "true");*/

		try {
			
			
			driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps); // it is used for pipeline

			/*driver = new AndroidDriver(service.getUrl(), options);*/ // this required for local emulator
			// driver = new AndroidDriver(new URL(prop.getProperty("ServerURL")),options); // this is not required
			 //driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), options); // this is required for browserstackckbrowser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void stopappium() {
		driver.quit();
	}

	public static void closeAppium() {
		service.stop();
	}

}
