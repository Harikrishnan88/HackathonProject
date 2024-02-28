package stepDefinition;

import java.io.IOException;

import CucumberTestBase.BaseClassCucumber;
import PageObjects.HomeLoanEmiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeLoanCalculator {
	HomeLoanEmiPage h=new HomeLoanEmiPage(BaseClassCucumber.getDriver());
	
	@Given("WebPage should navigate to the HomeLoan EMI Calculator")
	public void web_page_should_navigate_to_the_home_loan_emi_calculator() {
	    h.toClickLoanEmiCaculator();
	}

	@When("Enter the relevant details")
	public void enter_the_relevant_details() throws IOException {
	    h.enterRelevantdetails();
	}

	@When("Store the datas in the Excel")
	public void store_the_datas_in_the_excel() throws IOException {
		h.scrolltothetable();
	    h.storingExeldatas();
	}

}
