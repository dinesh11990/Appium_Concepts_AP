package com.krish.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9 PKQ1.180904.001");
		capabilities.setCapability("udid", "5d866ae2");
		capabilities.setCapability("deviceName", "Dinesh");
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver=new AndroidDriver(url,capabilities);
	
	}

}
