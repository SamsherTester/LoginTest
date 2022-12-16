package com.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest2 {
	
	@Test
	public void alertPromtTest() throws InterruptedException {
		
//		Create driver
		System.setProperty("webdriver.chrome.driver",
				"/home/dell/Documents/SeleniumSoftwares/chromeexefiles/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		
		driver.findElement(By.linkText("test confirm")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.print("alert mesge= " +text);
		
		Thread.sleep(5000);
		
		//alert.dismiss();
		
		alert.accept();
		
		

		
	}

}
