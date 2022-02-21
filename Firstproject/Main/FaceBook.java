package Firstproject.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {
	@Test
	public void stepsTopRep() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Pasword@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password");
		driver.findElement(By.id("u_0_b")).click();
	}

	
	}

