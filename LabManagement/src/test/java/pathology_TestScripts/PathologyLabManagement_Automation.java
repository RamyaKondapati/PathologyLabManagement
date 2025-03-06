package pathology_TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pathology_POM_Elements.AddPatients_CreatingTests;
import pathology_POM_Elements.CostCalculationpage;
import pathology_POM_Elements.Homepage;
import pathology_POM_Elements.Loginpage;
import pathology_POM_Elements.Patientpage;

public class PathologyLabManagement_Automation extends BaseTest{

	@Test(priority=0)
	public void LoginTest() throws InterruptedException {
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login();
		
		Homepage homepage = new Homepage(driver);
        boolean isDisplayed = homepage.isTodoListDisplayed();
        Assert.assertTrue(isDisplayed, "Todo list is not displayed on the Home Page!");
		
	}
	
	 @Test(priority = 1)
	    public void addPatientTest() {
	        Patientpage patientpage = new Patientpage(driver);
	        patientpage.addPatient("Ramya", "ramya@gmail.com", "9000879214","150","50","30");
	        
	    }
	
	 @Test(priority=2)
		public void addTests() throws InterruptedException {
		 AddPatients_CreatingTests create_patient_tests = new AddPatients_CreatingTests(driver);
		 create_patient_tests.addTests();
		 create_patient_tests.applyDiscount();
		 create_patient_tests.addEquipment();
			
	}
	 @Test(priority=3)
		public void CostCalculatorTest() throws InterruptedException {

		 CostCalculationpage cost = new CostCalculationpage(driver);
		// cost.selectTest("UR URIC ACID");
		 cost.getTotalCost();
		
	 }	
}
