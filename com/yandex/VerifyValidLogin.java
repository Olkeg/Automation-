package com.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class VerifyValidLogin {
	
	@Test
	public void chekValidUser() {
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://facebook.com/");
	
	LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);

	login_page.login_facebook("admin", "pass123");
		
	}

}
