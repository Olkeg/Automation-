package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class faceBook {

	@Test
	public void verifyValidLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		loginPage login = new loginPage(driver);
		
		login.typeuserName();
		login.typepassword();
		login.clickloginButton();
		
		driver.quit();
		
	}
	
	
	
}
