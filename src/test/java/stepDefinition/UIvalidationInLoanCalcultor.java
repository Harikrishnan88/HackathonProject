package stepDefinition;

import CucumberTestBase.BaseClassCucumber;
import PageObjects.LoanAmountCalculatorPage;
import PageObjects.loanCalculatorPage;
import PageObjects.loanTenureCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UIvalidationInLoanCalcultor {
	LoanAmountCalculatorPage l=new LoanAmountCalculatorPage(BaseClassCucumber.getDriver());
	loanCalculatorPage lc=new loanCalculatorPage(BaseClassCucumber.getDriver());
	loanTenureCalculator lt=new loanTenureCalculator(BaseClassCucumber.getDriver());
	
	@Given("WebPage should navigate to the LoanCalculator")
	public void web_page_should_navigate_to_the_loan_calculator() {
	    lc.navigateToloanEmiCalculator();
	    
	    
	}

	@Then("Perform UI validation for all textBoxes and slider for EmiCalculator")
	public void perform_ui_validation_for_all_text_boxes_and_slider_for_emi_calculator() {
	 lc.LoanEMIvalidation();
	}

	@Then("Perform UI validation for all textboxes and slider for LoanAmount Calculator")
	public void perform_ui_validation_for_all_textboxes_and_slider_for_loan_amount_calculator() {
	    l.LoanAmountvalidation();
	}

	@Then("Perform UI validation for all textboxes and slider for LoanTenure Calculator")
	public void perform_ui_validation_for_all_textboxes_and_slider_for_loan_tenure_calculator() {
	    lt.LoanTenureUivalidation();
	}

}
