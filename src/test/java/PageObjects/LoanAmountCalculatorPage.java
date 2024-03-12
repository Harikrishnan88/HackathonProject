package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoanAmountCalculatorPage extends BasePage {
	public  LoanAmountCalculatorPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//ul[@class='loancalculator-nav']/li[2]")
	WebElement clickonloanAmount;
	
	@FindBy(xpath="//input[@id='loanemi']")
	WebElement EmiTextbox;
	
	@FindBy(xpath="//div[@id='loanemislider']")
	WebElement Emislider;
	
	@FindBy(xpath="//input[@id='loaninterest']")
	WebElement Interestcheckbox;
	
	@FindBy(xpath="//div[@id='loaninterestslider']")
	WebElement Interestslider;
	
	@FindBy(xpath="//input[@id='loanterm']")
	WebElement InterestTenureCheckBox;
	
	@FindBy(xpath="(//span[@class='marker'])[25]")
	WebElement InterestTenureslider;
	
	
	@FindBy(xpath="(//label[@class='btn btn-secondary'])[1]")
	WebElement clickonMonth;
	
	@FindBy(xpath="//input[@id='loanfees']")
	WebElement FeesCheckbox;
	
	@FindBy(xpath="//div[@id='loanfeesslider']")
	WebElement Feesslider;
	

	public void SwitchtototalAmount() {
		clickonloanAmount.click();
	}
	
	public void LoanAmountvalidation() {

		Assert.assertTrue(EmiTextbox.isEnabled());

		Assert.assertTrue(Emislider.isEnabled());

		Assert.assertTrue(Interestcheckbox.isEnabled());

		Assert.assertTrue(Interestslider.isEnabled());
		
		String value1=InterestTenureslider.getText();
		clickonMonth.click();
		WebElement monthTenure=InterestTenureslider;
		String value2=monthTenure.getText();
		if(value1.equals(value2)) {
			System.out.println("Values are not changing");
		}
		else {
			System.out.println("Amount Tenure is validated");
		}

		Assert.assertTrue(FeesCheckbox.isEnabled());

		Assert.assertTrue(Feesslider.isEnabled());
	
}
}	
