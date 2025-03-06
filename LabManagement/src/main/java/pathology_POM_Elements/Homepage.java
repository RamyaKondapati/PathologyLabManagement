package pathology_POM_Elements;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.BaseMethods;

public class Homepage extends BaseMethods {
WebDriver driver;
	
	public Homepage(WebDriver superdriver) {
		super(superdriver);
		this.driver = superdriver;
		
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//li[@class='MuiListItem-container']")
	List<WebElement> todoList;
	@FindBy(xpath="//input[@id='patient-test']")
	WebElement costCalculator ;
	
	public boolean isTodoListDisplayed() {
		return !todoList.isEmpty();
		
	
	}
	
	
	public void navigateToCostCalculator() {
		waitForElementToBeClickable(costCalculator, 10);
		//scrollToElementBeforeClicking(costCalculator);
		costCalculator.click();	
	}
	
}
