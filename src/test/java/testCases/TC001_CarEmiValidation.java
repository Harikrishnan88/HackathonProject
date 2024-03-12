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
	public void homePageTitlevalidation() {
		CalculatorPage c=new CalculatorPage(driver);
		c.homePagevalidation();
	}
	@Test(priority=2)
	public void _Emi_validation_carLoan() throws IOException {
		CalculatorPage c=new CalculatorPage(driver);
		logger.info("***Interest Rate for car Loan for Current Year is initiated");
		c.clickCarLoan();
		c.check_emiCarLoan();
		c.conversionToMonth();
		logger.info("***Relevant details has been entered***");
	}
		
	@Test(priority=3)
	public void CalculateTotalAmount() {
		CalculatorPage c=new CalculatorPage(driver);
		logger.info("****Calculate total Amount****");
		c.getTotalEmiAmount();
		c.scroll_totalAmount();
		logger.info("***Total Emi amount has been calculated****");
		
	}	
	
	@Test(priority=4)
		public void totalAmount_InterestAmount_Calculation() {
			CalculatorPage cp=new CalculatorPage(driver);
			logger.info("***Principal Amount and Interest amount for one month is initiated****");
		 int totalPrincipalAmount=cp.principalAmount()-cp.totalInterestAmount();
		 System.out.println("Principal Amount "+totalPrincipalAmount);
		System.out.println("Interest for A Month "+cp.totalInterestAmount());
		logger.info("***Principal Amount and Interest amount for one month is calculated");
		
		
	}

	

}
