package testCases;


import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomeLoanEmiPage;
import testBase.BaseClass;

public class TC002_HomeLoanValidation extends BaseClass {

	@Test(priority=2)
	public void HomeLoanPageTitle() {
		HomeLoanEmiPage e=new HomeLoanEmiPage(driver);
		e.validatetitle();
	}
	@Test(priority=1)
	public void Navigate_HomeLoanValidation()  {
	HomeLoanEmiPage e=new HomeLoanEmiPage(driver);
	logger.info("**Navigate to Loan Emi Calculator****");
	e.toClickLoanEmiCaculator();
	
	}
	@Test(priority=3)
	public void switchToLoanEmiCalculatorPage() throws IOException  {
		HomeLoanEmiPage hl=new HomeLoanEmiPage(driver);
		logger.info("**** Enter the relevant details***");
		hl.enterRelevantdetails();
		hl.scrolltothetable();
		logger.info("****The details have been entered successfuly");
	}
	@Test(priority=4)
		public void storingThedataIntoExcel() throws IOException {
			HomeLoanEmiPage excel=new HomeLoanEmiPage(driver);
			logger.info("***The table values is stored in the excel**");
			excel.storingExeldatas();
		}
		
	}
	
	
	

