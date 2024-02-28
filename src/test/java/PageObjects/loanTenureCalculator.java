package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loanTenureCalculator extends BasePage{
	
	public  loanTenureCalculator(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='loancalculator-nav']/li[@id='loan-tenure-calc']")
	WebElement clickonloanTenure;
	
	@FindBy(xpath="//input[@id='loanamount']")
	WebElement loanAmountcheckbox;
	
	@FindBy(xpath="//div[@id='loanamountslider']")
	WebElement loanamountslider;
	
	@FindBy(xpath="//input[@id='loanemi']")
	WebElement emicheckbox;
	
	@FindBy(xpath="//div[@id='loanemislider']")
	WebElement emislider;
	
	@FindBy(xpath="//input[@id='loaninterest']")
	WebElement interestcheckbox;
	
	@FindBy(xpath="//div[@id='loaninterestslider']")
	WebElement interestslider;
	
	@FindBy(xpath="//input[@id='loanfees']")
	WebElement feescheckBox;
	
	@FindBy(xpath="//div[@id='loanfeesslider']")
	WebElement feesslider;
	
	public void switchToLoanTenure() {
		clickonloanTenure.click();
	}
	
	public void LoanTenureUivalidation() {
		if(loanAmountcheckbox.isEnabled()==true) {
			System.out.println("LoanAmountcheckBox is validated");
		}
		if(loanamountslider.isEnabled()==true) {
			System.out.println("Loan amountSlider is validated");
		}
		if(emicheckbox.isEnabled()==true) {
			System.out.println("Emicheckbox is validated");
		}
		if(emislider.isEnabled()==true) {
			System.out.println("EmiSlider is validated");
		}
		if(interestcheckbox.isEnabled()==true) {
			System.out.println("InterestcheckBox is validated");
		}
		if(interestslider.isEnabled()==true) {
			System.out.println("Interest slider is validated");
		}
		if(feescheckBox.isEnabled()==true) {
			System.out.println("fees CheckBox is validated");
			
		}
		if(feesslider.isEnabled()==true) {
			System.out.println("Fees slider is validated");
		}
	}
}
