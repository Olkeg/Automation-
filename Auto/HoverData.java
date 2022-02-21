package CursAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import frameWork.Boss;

public class HoverData extends Boss {
	
	@Test
	public void steps() throws InterruptedException {
		
		driver.get("https://www.marksandspencer.com/");
		
		Actions act = new Actions(driver);
		WebElement woman = driver.findElement(By.xpath("//a[@id='SC_Level_1_1_menu']"));
		act.moveToElement(woman).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"SC_Level_1_1\"]/div[1]/div[2]/ul[1]/li[3]/a")).click();
		
		driver.navigate().back();
	}
	
	
	
	

}
