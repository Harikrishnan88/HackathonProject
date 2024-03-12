package testCases;

import org.testng.annotations.Test;


import PageObjects.loanCalculatorPage;
import testBase.BaseClass;


	


public class TC003_HomeLoanEMIValidation extends BaseClass {
	@Test(priority=1)
	public void loanCalculatorPageValidation() {
	
		loanCalculatorPage l=new loanCalculatorPage(driver);
		l.navigateToloanEmiCalculator();
		l.validateloanCalculatorPage();
	}
	@Test(priority=2)
	public void loanCalculatorPageUivalidation() {
		logger.info("**** UI of Emi validation initiated*****");
		loanCalculatorPage l=new loanCalculatorPage(driver);
		
		l.LoanEMIvalidation();
		logger.info("***UI of EMI validation ended***");
		
	}
}
