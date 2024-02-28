package testCases;

import org.testng.annotations.Test;
import PageObjects.loanCalculatorPage;
import testBase.BaseClass;

public class TC003_HomeLoanEMIValidation extends BaseClass {
	@Test
	public void Uivalidation() {
		logger.info("****Emi validation initiated*****");
		loanCalculatorPage l=new loanCalculatorPage(driver);
		l.navigateToloanEmiCalculator();
		l.LoanEMIvalidation();
		logger.info("***EMI validation ended***");
		
	}
}
