package com.Diaspark.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	// WebDriver driver;

	public void toVerifyHeaderContent(WebDriver driver) {

		String arr[] = {"Home", "About Us", "Courses", "Corporate Training", "Contact Us" };

		int size = driver.findElements(By.xpath("//nav/ul/li/a/strong")).size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("(//nav/ul/li/a/strong)[" + i + "]")).getText();
			System.out.println(text);

			if (arr[i].equalsIgnoreCase(text)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}

}
