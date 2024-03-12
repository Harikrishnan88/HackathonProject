************************************************PROJECT DESCRIPTION*****************************************************************

                                                            
Problem Statement : Find the Interest Amount for current year

1. Buying a  car of 15 Lac
2. Interest rate of 9.5%
3. Tenure should be 1 year.
Display the interest amount & principal amount of first month.
(Suggested Site: emicalculator.net  / HDFCbank.com etc. however you are free to use any other legitimate site)


Detailed Description: Hackathon  Ideas

1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month
2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;
3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator
(Suggested Site: emicalculator.net  however you are free to use any other legitimate site)


Key Automation Scope:

Validation of transactions & do calculations;
Extract table values & store in excel
Filling data in screen & multiple UI validations
Navigation from Menus
Reusable methods
Scrolling down in web page


**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-You can also run in cucumber by clicking on TestRunner class and run as junit test 
-Now the file will Execute and we get the expected output as shown below.
 
*******************************************************FILES DESCRIPTION**************************************************************
 
1.src/test/java- There are five packages in this folder.
 
->CucumberTestBase :In this package there is one class CucumberBaseClass
 
->pageobject : In this package, the Basepage, CalculatorPage, homeLoanEmiPage,LoanAmountCalculatorPage and loanTenurePage classes are defined.
 
->stepdefinition : In this package,  HOOKS, CarloanCalculator,  and HomeLoanCalculator UIvalidation classes are defined.
 
->testcases  : In this package, TC001_CarEmiValidation, TC002_HomeloanValidation and TC003_HomeLoanEmiValidation,TC004_LoanAmountCalculators,TC005_LoanTenureValidation classes are defined.

->testrunner  : In this package, testRunner class is defined.
 
->Utility   : In this package, Excel class is defined.
 
2.src/test/resources- In this folder three files config.properties, extent.properties and log4j2.xml are defined.
 
3.JRE System Library: In this File we have all dependencies of JAR.files.         
 
4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.Excelsheet: In this folder  we have read and write excel sheets are present.

6.FeatureFiles  : In this folder FEATURES feature file is defined.
 
7.logs:In this folder automation.log report is present.

8.src: In this, there are two folders
	-main:It is an empty folder
	-test:It has all the BaseClass, Basepage, pageobject files, Stepdefinition files, Excel, FeatureFiles and properties files.
 
9.target: In this folder cucumber-reports, generated-test-sources, maven-status and surefire-reports are present. 

10.test-output: In this folder default suite, junitreports and SparkReports are present.
 
11.testng.xml: In this file, testNG xml code  is there.
 
12.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 
13.testng.xml : In this file, testNG xml code is there.
 
 
***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE-TestNG
 
***************************************************************************************************************************************
 
[RemoteTestNG] detected TestNG version 7.4.0
Total Emi Amount  :Loan EMI
₹15,11,875
Principal Amount 1500000
Interest for A Month 11875
EmiAmountcheckBox is validated
EMI Slider is validated
EmiInterestcheckbox is validated
EmiInterestSlider is validated
Emi Tenure is validated
FeesCheck box is validated
FeesSlider is validated
AmountcheckBox is validated
Amount Slider is validated
AmountInterestcheckbox is validated
AmountInterestSlider is validated
Amount Tenure is validated
FeesCheck box is validated
FeesSlider is validated
LoanAmountcheckBox is validated
Loan amountSlider is validated
Emicheckbox is validated
EmiSlider is validated
InterestcheckBox is validated
Interest slider is validated
fees CheckBox is validated
Fees slider is validated

===============================================
Suite
Total tests run: 12, Passes: 12, Failures: 0, Skips: 0
===============================================

================================


 
***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE-CUCUMBER
 
***************************************************************************************************************************************

Scenario: Calculating Emi for a Car Loan                [90m# featurefile/InterestRate.feature:3[0m
  [32mGiven [0m[32mWebPage should navigate to the HomePage[0m         [90m# stepDefinition.CarLoanCalculator.web_page_should_navigate_to_the_home_page()[0m

    Embedding Calculating Emi for a Car Loan [image/png 181974 bytes]

  [32mWhen [0m[32mEnter loan Amount ,interest rate and loan Tenure[0m [90m# stepDefinition.CarLoanCalculator.enter_loan_amount_interest_rate_and_loan_tenure()[0m

    Embedding Calculating Emi for a Car Loan [image/png 180894 bytes]

Total Emi Amount  :Loan EMI
₹15,11,875
Total Emi Amount  :Loan EMI
₹15,11,875
  [32mThen [0m[32mFind the Emi for one Year[0m                        [90m# stepDefinition.CarLoanCalculator.find_the_emi_for_one_year()[0m

    Embedding Calculating Emi for a Car Loan [image/png 66720 bytes]

Principal Amount 1500000
  [32mAnd [0m[32mDisplay the principal amount for one month[0m        [90m# stepDefinition.CarLoanCalculator.display_the_principal_amount_for_one_month()[0m

    Embedding Calculating Emi for a Car Loan [image/png 75143 bytes]

Interest for A Month 11875
  [32mAnd [0m[32mDisplay the Interest amount for one month[0m         [90m# stepDefinition.CarLoanCalculator.display_the_interest_amount_for_one_month()[0m

    Embedding Calculating Emi for a Car Loan [image/png 74527 bytes]


Scenario: Calculating the Emi for Loan  and display the data in the excel [90m# featurefile/InterestRate.feature:10[0m
  [32mGiven [0m[32mWebPage should navigate to the HomeLoan EMI Calculator[0m            [90m# stepDefinition.HomeLoanCalculator.web_page_should_navigate_to_the_home_loan_emi_calculator()[0m

    Embedding Calculating the Emi for Loan  and display the data in the excel [image/png 186286 bytes]

  [32mWhen [0m[32mEnter the relevant details[0m                                         [90m# stepDefinition.HomeLoanCalculator.enter_the_relevant_details()[0m

    Embedding Calculating the Emi for Loan  and display the data in the excel [image/png 187234 bytes]

  [32mAnd [0m[32mStore the datas in the Excel[0m                                        [90m# stepDefinition.HomeLoanCalculator.store_the_datas_in_the_excel()[0m

    Embedding Calculating the Emi for Loan  and display the data in the excel [image/png 150458 bytes]


Scenario: UI Validation                                                            [90m# featurefile/InterestRate.feature:15[0m
  [32mGiven [0m[32mWebPage should navigate to the LoanCalculator[0m                              [90m# stepDefinition.UIvalidationInLoanCalcultor.web_page_should_navigate_to_the_loan_calculator()[0m

    Embedding UI Validation [image/png 222347 bytes]

EmiAmountcheckBox is validated
EMI Slider is validated
EmiInterestcheckbox is validated
EmiInterestSlider is validated
Emi Tenure is validated
FeesCheck box is validated
FeesSlider is validated
  [32mThen [0m[32mPerform UI validation for all textBoxes and slider for EmiCalculator[0m        [90m# stepDefinition.UIvalidationInLoanCalcultor.perform_ui_validation_for_all_text_boxes_and_slider_for_emi_calculator()[0m

    Embedding UI Validation [image/png 150608 bytes]

AmountcheckBox is validated
Amount Slider is validated
AmountInterestcheckbox is validated
AmountInterestSlider is validated
Amount Tenure is validated
FeesCheck box is validated
FeesSlider is validated
  [32mAnd [0m[32mPerform UI validation for all textboxes and slider for LoanAmount Calculator[0m [90m# stepDefinition.UIvalidationInLoanCalcultor.perform_ui_validation_for_all_textboxes_and_slider_for_loan_amount_calculator()[0m

    Embedding UI Validation [image/png 149947 bytes]

LoanAmountcheckBox is validated
Loan amountSlider is validated
Emicheckbox is validated
EmiSlider is validated
InterestcheckBox is validated
Interest slider is validated
fees CheckBox is validated
Fees slider is validated
  [32mAnd [0m[32mPerform UI validation for all textboxes and slider for LoanTenure Calculator[0m [90m# stepDefinition.UIvalidationInLoanCalcultor.perform_ui_validation_for_all_textboxes_and_slider_for_loan_tenure_calculator()[0m

    Embedding UI Validation [image/png 149947 bytes]


