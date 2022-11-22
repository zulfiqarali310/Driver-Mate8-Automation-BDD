package com.DM8.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public static AppiumDriverLocalService service;
	public static AppiumDriver driver;

	static String UserDir = System.getProperty("user.dir");
	static String ApplicationPath = UserDir + "//Apps//DM8.apk";
	static File file = new File(UserDir + "//src//main//resources//config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();
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

	public String ipAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress")
			: prop.getProperty("ipAddress");
	public String port = prop.getProperty("port");

	public AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {

		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.usingDriverExecutable(new File("//usr//local//bin//node"));
		builder.withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"));
		builder.withIPAddress(ipAddress).usingPort(port);
		HashMap<String, String> environment = new HashMap();
		environment.put("PATH", "//usr//local//bin:" + System.getenv("PATH"));
		builder.withEnvironment(environment);
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		return service;

	}

	public static void setAndroidCapabilities() {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("Android_DeviceNames"));
		options.setPlatformName(prop.getProperty("Device_Type"));
		options.setUdid(prop.getProperty("Device_UDiD"));
		options.setPlatformVersion(prop.getProperty("Android_Version"));
		options.setApp(ApplicationPath);
		options.setAppPackage(prop.getProperty("App_package"));
		options.setAppActivity(prop.getProperty("App_Activity"));

		try {

			driver = new AndroidDriver(service.getUrl(), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

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
