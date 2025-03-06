package pathology_POM_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseMethods;

public class AddPatients_CreatingTests extends BaseMethods{

	WebDriver driver;
	 WebDriverWait wait;
	public AddPatients_CreatingTests(WebDriver superdriver) {
		super(superdriver);
		this.driver=superdriver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='patient-test']")
	WebElement addTestsForPatients;
	@FindBy(xpath="//*[@id=\"patient-test-popup\"]/ul/li[7]")
	WebElement uricAcidTest;
	@FindBy(xpath="//*[@id=\"patient-test-popup\"]/ul/li[4]")
	WebElement beansTest;
	
	@FindBy(xpath="//*[@id='patient-test-option-6']")
	List<WebElement> bloodTestCheckBox;
	 @FindBy(xpath = "//span[@id='PING_IFRAME_FORM_DETECTION']")
	 WebElement testIframe;
	    // Locator for selected test values
	    @FindBy(xpath = "//div[contains(@class,'MuiChip-root')]")
	    List<WebElement> selectedTests;
	    @FindBy(xpath="//div[@class='MuiFormControl-root']")
		WebElement discount;
	@FindBy(xpath="//*[@id=\"menu-\"]/div[3]/ul/li[3]")
	WebElement discountPercent;
	
	@FindBy(xpath="//button[@title='Add equipment']")
	WebElement addEquipment;
	@FindBy(xpath="(//div[@role='button'])[12]")  
	WebElement selectEquipment;
	@FindBy(xpath="//*[@id=\"menu-\"]/div[3]/ul/li[5]")
	WebElement equipmentOption;
	@FindBy(xpath="//span[text()='check']")
	WebElement saveEquipment;
	@FindBy(xpath="//span[text()='Add Patient']")
	WebElement addPatientButton;
	@FindBy(xpath="//span[text()='close']")
	WebElement clickOnClose;
	@FindBy(xpath="(//div[@role='combobox'])[2]")
	WebElement selectLab;
	 @FindBy(xpath="//*[@id=\"patient-tests-labs-option-1\"]")
	 WebElement selectLabOption;
	
	 public void addTests() {
		 addTestsForPatients.click();  
		 waitForElementToBeClickable(uricAcidTest,3);
		// scrollToElementBeforeClicking(uricAcidTest);
		 uricAcidTest.click();
		 addTestsForPatients.click();  
		 waitForElementToBeClickable(beansTest,3);
		 beansTest.click();
	    }    
	   
     public void applyDiscount() throws InterruptedException {

	 discount.click(); 
	 discountPercent.click();
	 waitForElementToBeClickable(selectLab,3);
	 selectLab.click();
	 waitForElementToBeClickable(selectLabOption,3);
	 selectLabOption.click();
	 scrollDown();
	    }
	  public void addEquipment() {
		  implicitwaitMethod();
		  addEquipment.click();
		  scrollToElementBeforeClicking(selectEquipment);
//		  waitForElementToBeClickable(selectEquipment,3); 
//		  selectEquipment.click();
		  waitForElementToBeClickable(equipmentOption,3);
		  equipmentOption.click();
		  saveEquipment.click();
		  addPatientButton.click();
		  clickOnClose.click();
	  }  
	   
	    
}
