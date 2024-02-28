Feature: Interest Rate for the Current Year using EmiCalculator

  Scenario: Calculating Emi for a Car Loan
    Given WebPage should navigate to the HomePage
    When Enter loan Amount ,interest rate and loan Tenure
    Then Find the Emi for one Year
    And Display the principal amount for one month
    And Display the Interest amount for one month

  Scenario: Calculating the Emi for Loan  and display the data in the excel
    Given WebPage should navigate to the HomeLoan EMI Calculator
    When Enter the relevant details
    And Store the datas in the Excel

  Scenario: UI Validation
    Given WebPage should navigate to the LoanCalculator
    Then Perform UI validation for all textBoxes and slider for EmiCalculator
    And Perform UI validation for all textboxes and slider for LoanAmount Calculator
    And Perform UI validation for all textboxes and slider for LoanTenure Calculator
