package com.krish.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Selendroid_TestRegistration {

	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Using Selendroid Application

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9 PKQ1.180904.001");
		capabilities.setCapability("udid", "5d866ae2");
		capabilities.setCapability("deviceName", "Dinesh");

		//dumpsys window windows | grep -E mCurrentFocus - Use it in adb shell

		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");

		URL url=new URL("http://0.0.0.0:4723/wd/hub");

		driver=new AndroidDriver(url,capabilities);

		WebElement registerButton = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		registerButton.click();

		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		userName.sendKeys("Dinesh");

		WebElement email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.sendKeys("dinesh11990@gmail.com");

		WebElement password = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		email.sendKeys("123456789");

		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("Windows");

		driver.navigate().back();

		WebElement programmingLanguage = driver.findElement(By.id("io.selendroid.testapp:id/input_preferredProgrammingLanguage"));
		programmingLanguage.click();

		//Xpath is not reliable , its better to use ID

		WebElement java = driver.findElement(By.xpath("//*[@text='Java']"));
		java.click();

		WebElement acceptAds = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
		acceptAds.click();

		WebElement register = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		register.click();



	}

}
