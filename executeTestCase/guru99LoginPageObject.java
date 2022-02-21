package executeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99LoginPageObject {
	
	
	public guru99LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='uid']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	public WebElement btnLogin;
	
	
	
}
