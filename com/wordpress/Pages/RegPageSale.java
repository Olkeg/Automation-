package com.wordpress.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegPageSale {

	
	@Test
	public void regPageOne() {
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.get("https://login.salesforce.com/");
	  driver.findElement(By.id("username")).sendKeys("Username");
	  
	  
	}
	
	
	
	
	
}