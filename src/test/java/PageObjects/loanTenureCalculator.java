package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testBase.BaseClass;

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

		Assert.assertTrue(loanAmountcheckbox.isEnabled());
		
		Assert.assertTrue(loanamountslider.isEnabled());

		Assert.assertTrue(emicheckbox.isEnabled());
		
		Assert.assertTrue(emislider.isEnabled());

		Assert.assertTrue(interestcheckbox.isEnabled());

		Assert.assertTrue(interestslider.isEnabled());

		Assert.assertTrue(feescheckBox.isEnabled());

		Assert.assertTrue(feesslider.isEnabled());
	}
}
