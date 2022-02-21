package Firstproject.Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
	@Test
	public void stepsTopRep() {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		WebElement field = driver.findElement(By.xpath("//input[@name ='q']"));
		field.sendKeys("Oleg");
		field.clear();
		driver.close();
	}
}
