package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.CalculatorPage;
import PageObjects.HomeLoanEmiPage;
import PageObjects.LoanAmountCalculatorPage;
import PageObjects.loanCalculatorPage;
import PageObjects.loanTenureCalculator;
import testBase.BaseClass;

public class TC001_CarEmiValidation extends BaseClass {
	
	@Test(priority=1)
	public void car_Emi_validation() throws IOException {
		CalculatorPage c=new CalculatorPage(driver);
		logger.info("***Interest Rate for car Loan for Current Year is initiated");
		c.clickCarLoan();
		c.check_emiCarLoan();
		c.conversionToMonth();
		logger.info("***Relevant details has been entered***");
	}
		
	@Test(priority=2)
	public void CalculateTotalAmount() {
		CalculatorPage c=new CalculatorPage(driver);
		c.getTotalEmiAmount();
		c.scroll_totalAmount();
		
	}	
	
	@Test(priority=3)
		public void car_emiCalculation() {
			CalculatorPage cp=new CalculatorPage(driver);
			logger.info("***Principal Amount and Interest amount for one month is initiated****");
		 int totalPrincipalAmount=cp.principalAmount()-cp.totalInterestAmount();
		 System.out.println("Principal Amount "+totalPrincipalAmount);
		System.out.println("Interest for A Month "+cp.totalInterestAmount());
		logger.info("***Principal Amount and Interest amount for one month is calculated");
		
	}

	

}
