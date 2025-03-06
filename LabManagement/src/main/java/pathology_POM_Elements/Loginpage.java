package pathology_POM_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver superdriver) {
		this.driver = superdriver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//input[@name='email']")
	WebElement emailTextBox;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement loginButton;
	
	public void login() {
		emailTextBox.sendKeys(ConfigReader.getProperty("app.username"));
		passwordTextBox.sendKeys(ConfigReader.getProperty("app.password"));
		loginButton.click();
		
	}
	
	
	
}
