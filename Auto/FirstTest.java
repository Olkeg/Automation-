package CursAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	@Test//(timeOut = 10000) 
	public void stepsToRep() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//screen max size
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//poisk elementa
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//zagruzka straniti
		
		String url = "https://google.com";
		driver.get(url);
		
		String name = "Oleg";
		
		WebElement fieldSearch = driver.findElement(By.xpath("//input[@name='q']"));
		fieldSearch.sendKeys(name);
		
		fieldSearch.clear();
		
		driver.navigate().refresh();
		
		String url1 = "https://youtube.com";
		driver.navigate().to(url1);
		
		
		WebElement fieldYouTube = driver.findElement(By.xpath("//input[@id='search']"));
		fieldSearch.sendKeys(name);
		Thread.sleep(1500);
		
		fieldYouTube.sendKeys(Keys.ENTER);//najatie na knopku ENTER
		Thread.sleep(1500);
		
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
		
	}
	
}
