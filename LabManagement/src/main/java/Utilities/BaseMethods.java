package Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {
	WebDriver driver;
    WebDriverWait wait;
	public BaseMethods(WebDriver driversuper)
	{
		this.driver = driversuper;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	public void implicitwaitMethod()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public WebElement visibilityOfElementLocated(WebElement ele, int i) {

		return wait.until(ExpectedConditions.visibilityOf(ele));

	}
	public WebElement waitForElementToBeClickable(WebElement element, int i) {

		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public List<WebElement> visibilityOfMultipleElementLocated(List<WebElement> ele, int i) {

		return wait.until(ExpectedConditions.visibilityOfAllElements(ele));

	}
	
	public void scrollDown() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000);");  // Scroll down by 500 pixels
	    Thread.sleep(1000);  
	}

	public void scrollToElementBeforeClicking(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
}
