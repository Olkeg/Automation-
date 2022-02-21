package CursAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frameWork.Boss;

public class GetText extends Boss {

	@Test
	public void steps() {

		driver.get("https://online.hl.co.uk/apply/account-application/account/70/"
				+ "personal-details/token/9f034e0f-a292-47e7-b412-ad6f95729874");
		
		
		WebElement fName = driver.findElement(By.xpath("//label[contains(text(),'First name')]"));
		String firstNameText = fName.getText().toLowerCase();
		driver.findElement(By.xpath("//input[@id='form_forename']")).sendKeys(firstNameText);
		
		
		WebElement lName = driver.findElement(By.xpath("//label[contains(text(),'Last name')]"));
		String lastNameText = lName.getText().toLowerCase();
		driver.findElement(By.xpath("//input[@id='form_surname']")).sendKeys(lastNameText);

	}

}
