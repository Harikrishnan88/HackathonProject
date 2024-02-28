package PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ExcelUtilities;

public class HomeLoanEmiPage extends BasePage{
	public  HomeLoanEmiPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@title='Calculators']")
	WebElement clickonCalculator;
	
	@FindBy(xpath="//*[@title='Home Loan EMI Calculator']")
	WebElement clickonHomeLoanCalculator;
	
	@FindBy(xpath="//*[@name='homeprice']")
	WebElement enterHomeLoanvalue;
	
	@FindBy(xpath="//*[@name='downpayment']")
	WebElement enterdownPayement;
	
	@FindBy(xpath="//*[@name='homeloaninsuranceamount']")
	WebElement enterLoanInsurance;
	
	@FindBy(xpath="//*[@name='homeloaninterest']")
	WebElement loanInterest;
	
	@FindBy(xpath="//*[@name='homeloanterm']")
	WebElement LoanTenure;
	
	@FindBy(xpath="//*[@name='loanfees']")
	WebElement LoanFees;
	
	@FindBy(xpath="//*[@name='onetimeexpenses']")
	WebElement oneTimeExpense;
	
	@FindBy(xpath="//*[@name='propertytaxes']")
	WebElement propertytax;
	
	@FindBy(xpath="//*[@name='homeinsurance']")
	WebElement homeInsurance;
	
	@FindBy(xpath="//*[@name='maintenanceexpenses']")
	WebElement maintenanceexpenses;
	
	@FindBy(xpath="//div[@id='paymentschedule']/table")
	WebElement yearOnYeartable;
	
	@FindBy(xpath="//table[@class='noextras']/tbody/tr")
	List<WebElement> tablerow;
	
	@FindBy(xpath="//table[@class='noextras']/tbody")
	WebElement table;
	
	public void clickOnCalculator() {
		  clickonCalculator.click();;
	}
	
	public void toClickLoanEmiCaculator() {
		clickonCalculator.click();
		clickonHomeLoanCalculator.click();
	}
	public void enterRelevantdetails() throws IOException {
		enterHomeLoanvalue.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 0, 6));
		enterdownPayement.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 1, 6));
		enterLoanInsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 2, 6));
		loanInterest.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 3, 6));
		LoanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 4, 6));
		LoanFees.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 5, 6));
		oneTimeExpense.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 6, 6));
		propertytax.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 7, 6));
		homeInsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),ExcelUtilities.getCellData("Sheet2", 8, 6));
		maintenanceexpenses.sendKeys(Keys.ENTER);
	}
	 public void scrolltothetable() {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",yearOnYeartable);
	 }
	 public  void storingExeldatas() throws IOException {
		 //Writes only the rows in the  table
		 ExcelUtilities.write("Sheet1", 0, 0,"Year");
		 ExcelUtilities.write("Sheet1", 0, 1,"Principal");
		 ExcelUtilities.write("Sheet1", 0, 2,"Interest");
		 ExcelUtilities.write("Sheet1", 0, 3,"Taxes, Home Insurance & Maintenance (C)");
		 ExcelUtilities.write("Sheet1", 0, 4,"Total Payment ");
		 ExcelUtilities.write("Sheet1", 0, 5,"Balance");
		 ExcelUtilities.write("Sheet1", 0, 6,"Loan Paid To Date");
		
		 
		 int sizeOfrows=tablerow.size();
		 for( int r=2;r<=sizeOfrows;r=r+2) {
			String Year= table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
			String Principal= table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String Interest= table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String Taxes= table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String Total_Payment= table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
			String Balance= table.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
			String Loan=table.findElement(By.xpath("tr["+r+"]/td[7]")).getText();
			 
			 ExcelUtilities.write("Sheet1",r , 0,Year );
			 ExcelUtilities.write("Sheet1",r , 1,Principal );
			 ExcelUtilities.write("Sheet1",r , 2,Interest );
			 ExcelUtilities.write("Sheet1",r , 3,Taxes );
			 ExcelUtilities.write("Sheet1",r , 4,Total_Payment );
			 ExcelUtilities.write("Sheet1",r , 5,Balance );
			 ExcelUtilities.write("Sheet1",r , 6,Loan);
		 }
		
		 
	 }

}
