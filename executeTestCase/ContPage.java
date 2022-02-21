package executeTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContPage {

	@Test
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://online.hl.co.uk/apply/account-application/account/70/"
				+ "personal-details/token/061b2e7c-350a-43a4-bd61-8f3cd05f1b1c");

		RegiPage loginPage = new RegiPage(driver);

		loginPage.btnMr.click();
		loginPage.firstName.sendKeys("Oleg");
		loginPage.lastName.sendKeys("Medvedev");
		loginPage.dateOfBirth.sendKeys("10101989");
		loginPage.gender.click();
		loginPage.maritalStatus.click();
		loginPage.maried.click();
		loginPage.nationalInsuranceNumber.sendKeys("SY690273B");
		loginPage.nationality.click();
		// loginPage.nationalityOne.isSelected();
		Select nationalOne = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_0']")));
		nationalOne.selectByIndex(145);

		Select nationalTwo = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_1']")));
		nationalTwo.selectByIndex(183);

		loginPage.romaniaCod.sendKeys("2222222222222");

		Select status = new Select(driver.findElement(By.xpath("//select[@id='form_employment_status']")));
		status.selectByIndex(3);

		Select retirementAge = new Select(driver.findElement(By.xpath("//select[@id='form_retirement_age']")));
		retirementAge.selectByIndex(2);
		loginPage.email.sendKeys("store89@inbox.ru");
		loginPage.phone.sendKeys("37369939695");
		loginPage.house.sendKeys("203");
		loginPage.postCode.sendKeys("20602");

		Select aboutAs = new Select(driver.findElement(By.xpath("//select[@id='form_source']")));
		aboutAs.selectByIndex(1);
		Thread.sleep(2000);
		loginPage.phoneTick.click();

		loginPage.postTick.click();

		loginPage.mailTick.click();

		Thread.sleep(2000);

		driver.quit();

	}
}
