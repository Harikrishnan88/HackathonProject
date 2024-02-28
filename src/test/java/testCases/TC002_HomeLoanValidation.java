package testCases;


import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.HomeLoanEmiPage;
import testBase.BaseClass;

public class TC002_HomeLoanValidation extends BaseClass {

	@Test(priority=1)
	public void HomeLoanValidation()  {
	HomeLoanEmiPage e=new HomeLoanEmiPage(driver);
	e.toClickLoanEmiCaculator();
	}
	@Test(priority=2)
	public void switchToLoanEmiCalculatorPage() throws IOException  {
		HomeLoanEmiPage hl=new HomeLoanEmiPage(driver);
		hl.enterRelevantdetails();
		hl.scrolltothetable();
	}
	@Test(priority=3)
		public void storingThedataIntoExcel() throws IOException {
			HomeLoanEmiPage excel=new HomeLoanEmiPage(driver);
			excel.storingExeldatas();
		}
		
	}
	
	
	

