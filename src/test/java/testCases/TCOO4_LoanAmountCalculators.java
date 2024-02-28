package testCases;

import org.testng.annotations.Test;

import PageObjects.LoanAmountCalculatorPage;
import testBase.BaseClass;

public class TCOO4_LoanAmountCalculators extends BaseClass {

	@Test
	public void LoanAmountCalculatorValidation() {
		logger.info("***Loan Amount validation initiated***");
		LoanAmountCalculatorPage l=new LoanAmountCalculatorPage(driver);
		l.SwitchtototalAmount();
		l.LoanAmountvalidation();
		logger.info("***Loan Amount validation ended");
	}
	
}
