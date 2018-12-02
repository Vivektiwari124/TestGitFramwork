package com.Diaspark.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class basePackage {

	public WebDriver driver;

	@BeforeSuite
	public void browserInvoke() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Sotwarw Selenium\\MyProject\\Sept15\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://gsure.in/");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@AfterTest
	public void QuitBroswer() {
		driver.quit();
	}

}
