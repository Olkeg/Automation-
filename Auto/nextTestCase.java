package CursAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nextTestCase {

	@Test
	public void stepsToRep() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailFaceBook = driver.findElement(By.xpath("//input[@id='email']"));
		emailFaceBook.sendKeys("Store89@inbox.ru");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("123456789aa");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='u_0_b']"));
		login.sendKeys(Keys.ENTER);
	}
}
