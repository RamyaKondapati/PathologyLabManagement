package base;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	protected WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
//		String chromeDriverPath = ConfigReader.getProperty("chromedriver.path");
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//		System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chromedriver.path"));
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("implicit.wait"))));
		driver.get(ConfigReader.getProperty("app.url"));
	}
//	@AfterClass
//	public void tearDown() {
//		if(driver != null) {
//			driver.quit();
//		}
//	}
	
}
