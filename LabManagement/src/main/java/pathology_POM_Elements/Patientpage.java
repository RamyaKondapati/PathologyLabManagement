package pathology_POM_Elements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseMethods;

public class Patientpage extends BaseMethods{
	WebDriver driver;
	 WebDriverWait wait;
	public Patientpage(WebDriver superdriver) {
		super(superdriver);
		this.driver=superdriver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Patients']")
	WebElement patientsTab;
	@FindBy(xpath="(//span[text()='Add Patient'])[1]")
	WebElement addPatientButton;
	@FindBy(xpath="//input[@name='name']")
	WebElement patientNameField;
	@FindBy(xpath="//input[@name='email']")
	WebElement patientEmailField;
	@FindBy(xpath="//input[@name='phone']")
	WebElement patientPhone;
	@FindBy(xpath="(//span[text()='General Details'])[2]")
	WebElement clickGeneralDetails;
	@FindBy(xpath="//input[@name='height']")
	WebElement height;
	@FindBy(xpath="//input[@name='weight']")
	WebElement weight;
	@FindBy(xpath="//div[@id='mui-component-select-gender']")
	WebElement gender;
	@FindBy(xpath="//input[@name='age']")
	WebElement age;
	@FindBy(xpath="//input[@name='systolic']	")
	WebElement systolic;
	@FindBy(xpath="//input[@name='diastolic']")
	WebElement diastolic;
	@FindBy(xpath="(//span[text()='Add Tests'])[2]")
	WebElement addTestsButton;
	@FindBy(xpath="(//ul[@role='listbox']/li)[3]")
	WebElement genderList;
//	@FindBy(xpath="")
//	WebElement h;
//	@FindBy(xpath="")
//	WebElement h;
//	@FindBy(xpath="")
//	WebElement h;
//	@FindBy(xpath="")
//	WebElement h;
	
	
	 public void addPatient(String name, String email, String phone,String high,String wei,String ag) {
		    patientsTab.click();
		    addPatientButton.click();
		    patientNameField.sendKeys(name);
	        patientEmailField.sendKeys(email);
	        patientPhone.sendKeys(phone);
	        clickGeneralDetails.click();
	        height.sendKeys(high);
	        weight.sendKeys(wei);
	        age.sendKeys(ag);
	        gender.click();
	        genderList.click();
	        addTestsButton.click();
	        
	        
	        
	    }
	
}
