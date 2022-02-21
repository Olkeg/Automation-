package CursAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiTest {

	WebDriver driver;
	String name = "Oleg";
	
	@Test(priority = 1)
	public void bbb() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(name);
		System.out.println("Title for this page is:" + driver.getTitle());
		System.out.println("Url for this page is:" + driver.getCurrentUrl());
		driver.quit();
	}
	
	@Test(priority = 20, dependsOnMethods = "ccc")
	public void aaa() {
		driver = new FirefoxDriver();
		String url = "https://mail.ru";
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[autocomplete='userame']")).sendKeys(name);
		System.out.println("Title for this page is:" + driver.getTitle());
		System.out.println("Url for this page is:" + driver.getCurrentUrl());
		driver.quit();
	}
	@Test
	public void ccc() {
		driver = new ChromeDriver();
		driver.get("httpe://www.google.com/");
		driver.findElement(By.xpath("Boss")).sendKeys("3232");
	}
}
