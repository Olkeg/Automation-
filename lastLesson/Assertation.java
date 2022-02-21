package lastLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertation {

	@Test
	public void steps() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		String titleActual = driver.getTitle().trim();
		String titleExpected = "Demo Guru99 Page";
		
		System.out.println(titleActual + " " + titleExpected);
		
		Assert.assertEquals(titleActual, titleExpected);
	}
	
}
