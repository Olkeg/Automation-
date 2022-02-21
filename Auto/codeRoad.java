package CursAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class codeRoad {
	
	@Test
	public void roadCode() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://coderoad.ru/");
		
		WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/"
				+ "div[1]/div[1]/input[1]"));
		Thread.sleep(1500);
		search.sendKeys("Automation");
		
		search.sendKeys(Keys.ENTER);
		
		WebElement next = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/"
				+ "div[1]/div[1]/div[2]/div[1]/h5[1]/a[1]/i[1]"));
		next.click();
		
		
		Thread.sleep(1500);
		driver.navigate().back();
		
		WebElement logo = driver.findElement(By.xpath("//a[contains(text(),'CodeRoad')]"));
		logo.click();
		driver.navigate().refresh();
		driver.quit();
	}

}
