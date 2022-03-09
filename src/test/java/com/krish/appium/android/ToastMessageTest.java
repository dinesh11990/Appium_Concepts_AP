package com.krish.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ToastMessageTest {
	
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// Using Selendroid Application

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9 PKQ1.180904.001");
		capabilities.setCapability("udid", "5d866ae2");
		capabilities.setCapability("deviceName", "Dinesh");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");

		driver=new AndroidDriver(url,capabilities);
		
		WebElement toastButton = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
		toastButton.click();
		
		WebElement toastMessage = driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
		String message= toastMessage.getText();
		
		System.out.println(message);

	}

}
