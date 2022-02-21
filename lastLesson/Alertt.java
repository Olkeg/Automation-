package lastLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertt {
	
	
	@Test
	public void method() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		
		//pervicinii keys i vtoricinii keys
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String AlertMessage = driver.switchTo().alert().getText();
		
		System.err.println(AlertMessage);
		
		Thread.sleep(1500);
		
		alert.accept();
		
	}

}
