package stepDefinition;

import java.io.IOException;

import CucumberTestBase.BaseClassCucumber;
import PageObjects.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarLoanCalculator {
	CalculatorPage c=new CalculatorPage(BaseClassCucumber.getDriver());
	@Given("WebPage should navigate to the HomePage")
	public void web_page_should_navigate_to_the_home_page() {
		c.clickCarLoan();
	}

	@When("Enter loan Amount ,interest rate and loan Tenure")
	public void enter_loan_amount_interest_rate_and_loan_tenure() throws IOException {
	  c.check_emiCarLoan();
	}

	@Then("Find the Emi for one Year")
	public void find_the_emi_for_one_year() throws IOException {
		c.check_emiCarLoan();
		c.conversionToMonth();
		c.getTotalEmiAmount();
		c.scroll_totalAmount();
		c.getTotalEmiAmount();
	}

	@Then("Display the principal amount for one month")
	public void display_the_principal_amount_for_one_month() {
		int totalPrincipalAmount=c.principalAmount()-c.totalInterestAmount();
		 System.out.println("Principal Amount "+totalPrincipalAmount);
	}

	@Then("Display the Interest amount for one month")
	public void display_the_interest_amount_for_one_month() {
		System.out.println("Interest for A Month "+c.totalInterestAmount());
	    
	}

}
