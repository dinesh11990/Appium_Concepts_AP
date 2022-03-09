package com.krish.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		//dumpsys window windows | grep -E mCurrentFocus - Use it in adb shell
		
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver=new AndroidDriver(url,capabilities);
		
		System.out.println("Done");
		
		//Used AppiumInspector and UI Automator Viewer
		WebElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		WebElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		WebElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		WebElement equalTo=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		
		one.click();
		plus.click();
		two.click();
		equalTo.click();
	
	}

}
