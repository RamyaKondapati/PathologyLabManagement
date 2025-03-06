package pathology_POM_Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseMethods;

public class CostCalculationpage extends BaseMethods{

	WebDriver driver;
	 WebDriverWait wait;
	public CostCalculationpage(WebDriver superdriver) {
		super(superdriver);
		this.driver=superdriver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"patient-test-option-7\"]")
	WebElement patientTest;
	@FindBy(xpath="//div[@class=\"MuiBox-root jss78\"]")
	WebElement total;
	@FindBy(xpath="//input[@id='patient-test']")
	WebElement addTest;
	@FindBy(xpath="//a[@href='/dashboard']")
	WebElement dashboard;
//	@FindBy(xpath="")
//	WebElement a;
//	@FindBy(xpath="")
//	WebElement a;
	
	public void selectTest(String testName) {
		dashboard.click();
		    try {
		    	scrollDown();
		    	addTest.click();
		    	waitForElementToBeClickable(patientTest,3);
		        // Scroll into view
		        WebElement testElement = wait.until(ExpectedConditions.presenceOfElementLocated(
		                By.xpath("//*[@id=\"patient-test-popup\"]/ul/li[7]") ));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", testElement);
		        Thread.sleep(3000);

		        // Click using JavaScript in case of hidden input
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", testElement);

		        System.out.println("Clicked on: " + testName);
		    } catch (Exception e) {
		        System.out.println("Failed to click test: " + testName);
		        e.printStackTrace();
		    }
		}
	
	 public String getTotalCost() throws InterruptedException {
		 dashboard.click();
		 scrollDown();
		 Thread.sleep(3000);
		 try {
		   return total.getText();  
	 } catch (Exception e) {
	        System.out.println("Total cost calculation failed: ");
	        e.printStackTrace();
	    }
		return null;
	    }

}
