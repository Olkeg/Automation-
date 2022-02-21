package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContentPage {

	@Test

	public void completePage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.hl.co.uk/apply/account-application/account/70/"
				+ "personal-details/token/061b2e7c-350a-43a4-bd61-8f3cd05f1b1c");

		RegPage content = new RegPage(driver);

		content.clickmr();
		content.typefirstName();
		content.typelastName();
		content.typedateOfBirth();
		content.clickgender();
		content.selectByIndexmaritalStatus();
		content.typenationalInsuranceNumber();
		content.clicknationality();
		content.selectByIndexnationalityOne();
		content.selectByIndexnationalityTwo();
		content.typeromaniaCod();
		content.selectByIndexretirementAge();
		content.selectByIndexmStatus();
		content.typeemail();
		content.typephone();
		content.typehouse();
		content.typepostCode();
		content.selectByIndexaboutAs();
		content.clickphoneTick();
		content.clickpostTick();
		content.clickmailTick();
		Thread.sleep(2000);
		driver.quit();

	}

}
