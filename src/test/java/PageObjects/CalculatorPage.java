package PageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.ExcelUtilities;


public class CalculatorPage extends BasePage {
	public CalculatorPage(WebDriver driver) {
		super(driver);
	}
	 public JavascriptExecutor js= (JavascriptExecutor) driver;
	 @FindBy(xpath="//div[@class='page-header']/h1")
	 WebElement HomePagetitle;
	 
	@FindBy(xpath="//*[@class='loanproduct-nav']/li[@id='car-loan']")
	WebElement clickCarLoan;
	
	@FindBy(xpath="//*[@id='loanamount']")
	WebElement enterLoanAmount;

	@FindBy(xpath="//*[@id='loaninterestslider']")
	WebElement slideLoanInterest;
	
	@FindBy(xpath="//*[@id='loanterm']")
	WebElement enterLoanTenure;
	
	@FindBy(xpath="//*[@id='emitotalinterest']/p/span")
	WebElement totalInterest;
	
	@FindBy(xpath="//*[@id='emitotalamount']/p/span")
	WebElement totalPayement;
	
	@FindBy(xpath="//div[@id='emiamount']")
	WebElement total_emiAmount;
	
	@FindBy(xpath="//*[@class='row gutter-left gutter-right']")
	WebElement scrollPage; 
	
	@FindBy(xpath="(//*[@class='btn btn-secondary'])[1]")
	WebElement clickonmonth;
	
	public void homePagevalidation() {
		String webPagetitle="EMI Calculator for Home Loan, Car Loan & Personal Loan in India";
		String expectedtitle=driver.getTitle();
		Assert.assertEquals(webPagetitle, expectedtitle);
	}
	public void clickCarLoan() {
		clickCarLoan.click();
	}
	
	public void check_emiCarLoan() throws IOException {
		enterLoanAmount.clear();
		enterLoanAmount.sendKeys(ExcelUtilities.getCellData("Sheet2", 0, 1));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slideLoanInterest, -130, 50).perform();
		

		enterLoanTenure.clear();

		
		
		}
	public void scroll_totalAmount() {
		js.executeScript("arguments[0].scrollIntoView();",scrollPage);
	}
	public void conversionToMonth() throws IOException {
		clickonmonth.click();
		enterLoanTenure.clear();
		enterLoanTenure.sendKeys(Keys.BACK_SPACE);
		enterLoanTenure.sendKeys(Keys.BACK_SPACE);
		enterLoanTenure.sendKeys(ExcelUtilities.getCellData("Sheet2", 1, 1));
		enterLoanTenure.sendKeys(Keys.ENTER);
		
		
	}
	
	public int principalAmount() {
		String value=totalPayement.getText();
		String[] var=value.split(",");
		String s=var[0]+var[1]+var[2];		
		int n=Integer.parseInt(s);
		return n;
		
		
	}
	public int totalInterestAmount() {
		String value=totalInterest.getText();	
		String[] var1=value.split(",");
		String s=var1[0]+var1[1];
		int n=Integer.parseInt(s);
		return n;
	}
	public void getTotalEmiAmount() {
		System.out.println("Total Emi Amount  :"+total_emiAmount.getText());
	}
	
	
}

