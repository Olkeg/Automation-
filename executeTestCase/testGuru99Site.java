package executeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGuru99Site {
   
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		guru99LoginPageObject login_Page = new guru99LoginPageObject(driver);
		
		login_Page.userName.sendKeys("mrg123");
		login_Page.password.sendKeys("mrg!23");
		login_Page.btnLogin.click();
		driver.quit();
	}

	}
	
	

