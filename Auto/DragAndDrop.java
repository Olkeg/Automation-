package CursAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import frameWork.Boss;

public class DragAndDrop extends Boss {
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(2000);
	}

}
