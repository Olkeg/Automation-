package com.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew {

	WebDriver driver;
	
	public LoginPageNew(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='u_0_b']")
	WebElement btnLoggin;
	
	public void login_facebook(String uid,String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		btnLoggin.click();
		driver.quit();
		
	}
	
	
}
