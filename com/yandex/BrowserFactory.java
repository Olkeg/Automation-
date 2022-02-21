package com.yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url) {
		
		if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			}
		else if(browserName.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
	   driver.manage().window().maximize();
	   driver.get("https://facebook.com/");
	   
	   return driver;
	}
	
	

}
