package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {


		@Test
		public void login() {

			System.setProperty("webdriver.chrome.driver",
					"/home/dell/Documents/SeleniumSoftwares/chromeexefiles/chromedriver");
			WebDriver driver = new ChromeDriver();
			//navigating
			driver.get("https://github.com");
			
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
			driver.quit();
			
			
			
			
		}

	}
