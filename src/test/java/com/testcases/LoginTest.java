package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	public class Login {

		@Test
		public void login() {

			System.setProperty("webdriver.chrome.driver",
					"/home/dell/Documents/SeleniumSoftwares/chromeexefiles/chromedriver");
			WebDriver driver = new ChromeDriver();
			//navigating
			driver.get("google.com");
			
			driver.quit();
			
			
			
			
		}

	}
}