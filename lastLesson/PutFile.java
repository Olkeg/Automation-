package lastLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PutFile {
    @Test
	public void fileGo() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement uploadFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		uploadFile.sendKeys("C:\\Drivers\\abc.txt");
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		
		
	}
	
	
}
