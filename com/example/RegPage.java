package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegPage {

	WebDriver driver;
	
	public RegPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void RegPageNew(WebDriver driver) {

		this.driver = driver;
	}

	By mr = By.xpath("//label[@for='title-option-0']");
	By firstName = By.xpath("//input[@id='form_forename']");
	By lastName = By.xpath("//input[@id='form_surname']");
	By dateOfBirth = By.xpath("//input[@id='form_date_of_birth']");
	By gender = By.xpath("//label[contains(text(),'Male')]");
	By maritalStatus = By.xpath("//select[@id='form_marital_status']");
	By nationalInsuranceNumber = By.xpath("//input[@id='form_nino']");
	By nationality = By.xpath("//label[contains(text(),'Multiple nationalities')]");
	By nationalityOne = By.xpath("//select[@id='form_mifid_choice_nationality_0']");
	By nationalityTwo = By.xpath("//select[@id='form_mifid_choice_nationality_1']");
	By romaniaCod = By.xpath("//input[@id='form_mifid_identifier_1']");
	By status = By.xpath("//select[@id='form_employment_status']");
	By retirementAge = By.xpath("//select[@id='form_retirement_age']");
	By mStatus = By.xpath("//select[@id='form_marital_status']");
	By email = By.xpath("//input[@id='form_email']");
	By phone = By.xpath("//input[@id='form_phone_number']");
	By house = By.xpath("//input[@id='form_house_number']");
	By postCode = By.xpath("//input[@id='form_postcode']");
	By aboutAs = By.xpath("//select[@id='form_source']");
	By phoneTick = By.xpath("//label[@for='form_no_phone']");
	By postTick = By.xpath("//label[@for='form_no_mail']");
	By mailTick = By.xpath("//label[@for='form_no_email']");

	

	public void clickmr() {
		driver.findElement(mr);
	}

	public void typefirstName() {
		driver.findElement(firstName).sendKeys("Oleg");
	}

	public void typelastName() {
		driver.findElement(lastName).sendKeys("Medvedev");
	}

	public void typedateOfBirth() {
		driver.findElement(dateOfBirth).sendKeys("10101989");
	}

	public void clickgender() {
		driver.findElement(gender).click();
	}

	public void selectByIndexmaritalStatus() {
		driver.findElement(maritalStatus).click();
		driver.findElement(By.xpath("//option[contains(text(),'Single')]")).click();
	}

	public void typenationalInsuranceNumber() {
		driver.findElement(nationalInsuranceNumber).sendKeys("SY690273B");
	}

	public void clicknationality() {
		driver.findElement(nationality).click();
	}

	public void selectByIndexnationalityOne() throws InterruptedException {
		Thread.sleep(2000);
		Select nationalityOne = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_0']")));
		Thread.sleep(2000);
		nationalityOne.selectByIndex(145);

	}

	public void selectByIndexnationalityTwo() throws InterruptedException {
		Thread.sleep(2000);
		Select nationalityTwo = new Select(
				driver.findElement(By.xpath("//select[@id='form_mifid_choice_nationality_1']")));
		Thread.sleep(2000);
		nationalityTwo.selectByIndex(183);
		Thread.sleep(2000);
	}

	public void typeromaniaCod() {
		driver.findElement(romaniaCod).sendKeys("2222222222222");
	}

	public void selectByIndexretirementAge() {
		driver.findElement(retirementAge).isSelected();
	}

	public void selectByIndexmStatus() {
		driver.findElement(mStatus).isSelected();
	}

	public void typeemail() {
		driver.findElement(email).sendKeys("store89@inbox.ru");
	}

	public void typephone() {
		driver.findElement(phone).sendKeys("37369939695");
	}

	public void typehouse() {
		driver.findElement(house).sendKeys("203");
	}

	public void typepostCode() {
		driver.findElement(postCode).sendKeys("20602");
	}

	public void selectByIndexaboutAs() {
		driver.findElement(aboutAs).isSelected();
	}

	public void clickphoneTick() {
		driver.findElement(phoneTick).click();
	}

	public void clickpostTick() {
		driver.findElement(postTick).click();
	}

	public void clickmailTick() {
		driver.findElement(mailTick).click();
	}

}
