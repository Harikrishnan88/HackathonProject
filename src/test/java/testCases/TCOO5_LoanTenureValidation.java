package testCases;

import org.testng.annotations.Test;

import PageObjects.loanTenureCalculator;
import testBase.BaseClass;

public class TCOO5_LoanTenureValidation extends BaseClass {

	@Test
	public void LoanTenureUIvalidation() {
		logger.info("*** LoanTenure validation initiated***");
		loanTenureCalculator t=new loanTenureCalculator(driver);
		t.switchToLoanTenure();
		t.LoanTenureUivalidation();
		logger.info("***Loan Tenure validation ended");
	}
}
