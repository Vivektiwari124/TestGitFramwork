package com.Diaspark.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	// WebDriver driver;

	public void toVerifyHeaderContent(WebDriver driver) {

		String arr[] = { "HOME", "ABOUT US", "COURSES", "CORPORATE TRAINING", "CONTACT US" };

		int size = driver.findElements(By.xpath("//nav/ul/li/a/strong")).size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("(//nav/ul/li/a/strong)[" + i + "]")).getText();
			System.out.println(text);
			System.out.println(arr[i-1]);
			System.out.println("dsdsds");
			
			int var = arr[i-1].compareTo(text);
			if (var == 0) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}

}
