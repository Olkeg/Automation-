package CursAuto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	
	@Test
	public void steps() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("Https://protv.md");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int a = 0; a < 10; a++) {
			js.executeScript("window.scrollBy(0, 250)", "");
			Thread.sleep(1000);
	   }
		
		
		for(int a = 0; a < 10; a++) {
			js.executeScript("window.scrollBy(0, -250)", "");
			Thread.sleep(1000);
	   }
		
	}

}
