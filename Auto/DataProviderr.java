package CursAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr {
	
	@Test(dataProvider = "password")
	public void steps(String username, String password) {// parametri medoda
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ok.ru");
		
		driver.findElement(By.xpath("//input[@id='field_email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='field_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		
		}
	
	@DataProvider(name = "password")
	public Object[][] data(){
		
		return new Object[][] {
			
			
			{"djalim@gmail.com","12345678"},
			{"djalim7@gmail.com","rrrrrrr"},
			{"12345678","xxxxxxxx"},
			{"dkjnfdkf","xvcbfjd.....434"},
			{"bestofthe best","oiuytre"},
			{"superpuper","sdfghjkljij"}
			
			
		};
		
		}
	
	

}
