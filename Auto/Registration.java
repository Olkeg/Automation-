package CursAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

	@Test
	public void regForm() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://online.hl.co.uk/apply/account-application"
				+ "/account/70/personal-details/token/78bfef66-c3e" + "e-4ed5-a57b-cdd9fc0762a4");

		WebElement mr = driver.findElement(By.xpath("//label[@for='title-option-0']"));
		mr.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='form_forename']"));
		firstName.sendKeys("Oleg");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='form_surname']"));
		lastName.sendKeys("Medvedev");

		WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='form_date_of_birth']"));
		dateOfBirth.sendKeys("10101989");

		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();

		Select maritalStatus = new Select(driver.findElement(By.xpath("//select[@id='form_marital_status']")));
		maritalStatus.selectByIndex(3);

		WebElement nationalInsuranceNumber = driver.findElement(By.xpath("//input[@id='form_nino']"));
		nationalInsuranceNumber.sendKeys("SY690273B");

		WebElement nationality = driver.findElement(By.xpath("//label[contains(text(),'Multiple nationalities')]"));
		nationality.click();

		Select nationalityOne = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_0']")));
		nationalityOne.selectByIndex(145);

		Select nationalityTwo = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_1']")));
		nationalityTwo.selectByIndex(183);

		WebElement romaniaCod = driver.findElement(By.xpath("//input[@id='form_mifid_identifier_1']"));
		romaniaCod.sendKeys("2222222222222");

		Select status = new Select(driver.findElement(By.xpath("//select[@id='form_employment_status']")));
		status.selectByIndex(2);

		Select retirementAge = new Select(driver.findElement(By.xpath("//select[@id='form_retirement_age']")));
		retirementAge.selectByIndex(3);

		Select mStatus = new Select(driver.findElement(By.xpath("//select[@id='form_marital_status']")));
		mStatus.selectByIndex(4);

		WebElement email = driver.findElement(By.xpath("//input[@id='form_email']"));
		email.sendKeys("store89@inbox.ru");

		WebElement phone = driver.findElement(By.xpath("//input[@id='form_phone_number']"));
		phone.sendKeys("37369939695");

		WebElement house = driver.findElement(By.xpath("//input[@id='form_house_number']"));
		house.sendKeys("203");

		WebElement postCode = driver.findElement(By.xpath("//input[@id='form_postcode']"));
		postCode.sendKeys("20602");

		Select aboutAs = new Select(driver.findElement(By.xpath("//select[@id='form_source']")));
		aboutAs.selectByIndex(3);

		driver.findElement(By.xpath("//label[@for='form_no_phone']")).click();

		driver.findElement(By.xpath("//label[@for='form_no_mail']")).click();

		driver.findElement(By.xpath("//label[@for='form_no_email']")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
