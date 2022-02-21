package executeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegiPage {

	public RegiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='title-option-0']")
	public WebElement btnMr;

	@FindBy(xpath = "//input[@id='form_forename']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='form_surname']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='form_date_of_birth']")
	public WebElement dateOfBirth;

	@FindBy(xpath = "//label[contains(text(),'Male')]")
	public WebElement gender;

	@FindBy(xpath = "//select[@id='form_marital_status']")
	public WebElement maritalStatus;
	
	@FindBy(xpath = "//option[contains(text(),'Married')]")
	public WebElement maried;
	
	@FindBy(xpath = "//input[@id='form_nino']")
	public WebElement nationalInsuranceNumber;

	@FindBy(xpath = "//label[contains(text(),'Multiple nationalities')]")
	public WebElement nationality;

    //@FindBy(xpath = "//select[@id='form_mifid_choice_nationality_0']")
    //public WebElement nationalityOne;
	

	//@FindBy(xpath = "//select[@id='form_mifid_choice_nationality_1']")
	//public WebElement nationalityTwo;

	@FindBy(xpath = "//input[@id='form_mifid_identifier_1']")
	public WebElement romaniaCod;

	//@FindBy(xpath = "//select[@id='form_employment_status']")
	//public WebElement status;

	//@FindBy(xpath = "//select[@id='form_retirement_age']")
	//public WebElement retirementAge;

	@FindBy(xpath = "//select[@id='form_marital_status']")
	public WebElement mStatus;

	@FindBy(xpath = "//input[@id='form_email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='form_phone_number']")
	public WebElement phone;

	@FindBy(xpath = "//input[@id='form_house_number']")
	public WebElement house;

	@FindBy(xpath = "//input[@id='form_postcode']")
	public WebElement postCode;

	//@FindBy(xpath = "//select[@id='form_source']")
	//public WebElement aboutAs;

	@FindBy(xpath = "//label[@for='form_no_phone']")
	public WebElement phoneTick;

	@FindBy(xpath = "//label[@for='form_no_mail']")
	public WebElement postTick;

	@FindBy(xpath = "//label[@for='form_no_email']")
	public WebElement mailTick;

	
		
	}

	

	

	


