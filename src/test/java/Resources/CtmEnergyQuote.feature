Feature: To Test different functionality of components within the journey to help user select and switch to better plan

  Background: User is on Compare to market energy quote page
 @test
 Scenario: User is comparing price quotes for  both Gas and Electricity
   When user inputs a valid postcode "PE2 6YS"
    And clicks on Find postcode
    And selects "No I don't have my bill"
    And clicks on "Gas and Electricity" button
    And clicks on "I don't know" option for current Electricity supplier
    And clicks on "I don't know" option for current Gas supplier
    And clicks on Next button
    Then user is navigated to Your Energy No Bill Page
    When selects "No" for Prepayment Pay As you Go meter
    And selects "No" for Economy 7 meter
    And inputs the price as £"50" in input box for Electricity
    And selects period as "Monthly" from the dropdown Electricity
    And inputs the price as £"40" in input box for Gas
    And selects period as "Monthly" from the dropdown Gas
    And clicks on Next
    Then user is navigated to Your Details page
    When selects "Fixed Tariff" as interested traffic
    And clicks on "Monthly Direct Debit" as way of payment
    And enters a valid "abc@def.com"
    And clicks on I confirm for  the Terms and Conditions
    And clicks on Go to Prices button
    Then User is navigated to Your Results Page

 @test
   Scenario: User should not be able to go further to bill page after entering incorrect Postcode
    When User inputs an invalid "PE2 6"
    And clicks on Find postcode
    And system does not validates the postcode and shows an error message display
    And selects "No I don't have my bill"
    And clicks on "Gas and Electricity" button
    And clicks on Next button
    Then user is not able to navigate to Your Energy No Bill Page

 @test
  Scenario: User should be guided properly on how to get started
   When user clicks on how to get started option
   Then User get to sees brief summary to explain further steps





