package PageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class loanCalculatorPage extends BasePage{
	public  loanCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//a[@title='Loan Calculator']")
	WebElement clickOnLoanCalculator;
	
	@FindBy(xpath ="(//input[@class='form-control'])[1]")
	WebElement EmiamountCheckbox;
	
	@FindBy(xpath ="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement EmiamountSlider;
	
	@FindBy(xpath ="(//input[@class='form-control'])[3]")
	WebElement Emiinterestcheckbox;
	
	@FindBy(xpath ="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement Emiinterestslider;
	
	@FindBy(xpath ="(//input[@class='form-control'])[4]")
	WebElement EmiTensurecheckbox;
	
	@FindBy(xpath ="(//span[@class='marker'])[25]")
	WebElement EmiTensureScale1;
	
	@FindBy(xpath ="//label[@class='btn btn-secondary']")
	WebElement EmiMonth;
	
	@FindBy(xpath ="(//span[@class='marker'])[25]")
	WebElement EmiTensureScale2;
	
	@FindBy(xpath ="(//input[@class='form-control'])[5]")
	WebElement FeesCheckbox;
	
	@FindBy(xpath ="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement Feesslider;
	
	public void navigateToloanEmiCalculator() {
		HomeLoanEmiPage h=new HomeLoanEmiPage(driver);
		h.clickOnCalculator();
		clickOnLoanCalculator.click();
		
	}
	public void validateloanCalculatorPage() {
		String webPagetitle="Loan Calculator — Calculate EMI, Affordability, Tenure & Interest Rate";
		String expectedtitle=driver.getTitle();
		Assert.assertEquals(webPagetitle, expectedtitle);
	}
	public void LoanEMIvalidation() {
		Assert.assertTrue(EmiamountCheckbox.isEnabled());

		Assert.assertTrue(EmiamountSlider.isEnabled());

		Assert.assertTrue(Emiinterestcheckbox.isEnabled());

		Assert.assertTrue(Emiinterestslider.isEnabled());
		
		String value1=EmiTensureScale1.getText();
		EmiMonth.click();
		String value2=EmiTensureScale2.getText();
		if(value1.equals(value2)) {
			System.out.println("Values are not changing");
		}
		else {
			System.out.println("Emi Tenure is validated");
		}

		Assert.assertTrue(FeesCheckbox.isEnabled());

		Assert.assertTrue(Feesslider.isEnabled());
		
		
	}

	
}
