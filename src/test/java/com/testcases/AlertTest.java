package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertTest {

	@Test
	public void alertTest() throws InterruptedException {

//		Create driver
		System.setProperty("webdriver.chrome.driver",
				"/home/dell/Documents/SeleniumSoftwares/chromeexefiles/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		// implicit wait on driver reference
	//	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("See an example alert")).click();
		
		//wait fo 10 second
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();

		alert.accept();

	}

}
