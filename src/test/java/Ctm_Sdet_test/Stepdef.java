package Ctm_Sdet_test;

import Pages.YourDetails;
import Pages.YourEnergyNoBill;
import Pages.YourResult;
import Pages.YourSupplier;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Y;


public class Stepdef extends utils{
    YourSupplier yourSupplier = new YourSupplier();
    YourEnergyNoBill yourEnergyNoBill = new YourEnergyNoBill();
    YourDetails yourDetails = new YourDetails();
    YourResult yourResult = new YourResult();

    @When("^user inputs a valid postcode \"([^\"]*)\"$")
    public void user_inputs_a_valid_postcode(String arg1) {
        yourSupplier.validateUrl();
        yourSupplier.enterPostCode();

    }

    @When("^clicks on Find postcode$")
    public void clicks_on_Find_postcode() {
        yourSupplier.clickOnSearchPostcode();

    }

    @When("^selects \"([^\"]*)\"$")
    public void selects(String arg1) {
        yourSupplier.clickOnIDontHaveMyBillButton();
    }

    @When("^clicks on \"([^\"]*)\" button$")
    public void clicks_on_button(String arg1) {
        yourSupplier.clickOnGasAndElectricityTab();
    }

    @When("^clicks on \"([^\"]*)\" option for current Electricity supplier$")
    public void clicks_on_option_for_current_Electricity_supplier(String arg1) {
        yourSupplier.clickonIDontKnowForElectricity();
    }

    @When("^clicks on \"([^\"]*)\" option for current Gas supplier$")
    public void clicks_on_option_for_current_Gas_supplier(String arg1) {
        yourSupplier.clickonIDontKnowForGas();
    }

    @When("^clicks on Next button$")
    public void clicks_on_Next_button() {
        yourSupplier.clickonNextButton();
    }

    @Then("^user is navigated to Your Energy No Bill Page$")
    public void user_is_navigated_to_Your_Energy_No_Bill_Page() {
        //yourEnergyNoBill.validateUrl();
       System.out.println(driver.getTitle());



    }

    @When("^selects \"([^\"]*)\" for Prepayment Pay As you Go meter$")
    public void selects_for_Prepayment_Pay_As_you_Go_meter(String arg1) {
        yourEnergyNoBill.clickOnNoForPAymentPAyAsYoyGo();

    }

    @When("^selects \"([^\"]*)\" for Economy (\\d+) meter$")
    public void selects_for_Economy_meter(String arg1, int arg2) {
        yourEnergyNoBill.clickOnNoForEconomy7Meter();
    }

    @When("^inputs the price as £\"([^\"]*)\" in input box for Electricity$")
    public void inputs_the_price_as_£_in_input_box_for_Electricity(String arg1) {
        yourEnergyNoBill.inputPriceForElectricity();

    }

    @When("^selects period as \"([^\"]*)\" from the dropdown Electricity$")
    public void selects_period_as_from_the_dropdown_Electricity(String arg1) {
        yourEnergyNoBill.selectPlanForElectricity();
    }

    @When("^inputs the price as £\"([^\"]*)\" in input box for Gas$")
    public void inputs_the_price_as_£_in_input_box_for_Gas(String arg1) {
        yourEnergyNoBill.inputPriceForGas();
    }


    @When("^selects period as \"([^\"]*)\" from the dropdown Gas$")
    public void selects_period_as_from_the_dropdown_Gas(String arg1) {
        yourEnergyNoBill.selectPlanForGas();
    }

    @When("^clicks on Next$")
    public void clicks_on_Next() {
        yourEnergyNoBill.clickOnNextButton();
    }

    @Then("^user is navigated to Your Details page$")
    public void user_is_navigated_to_Your_Details_page() {
        yourDetails.validateTittle();

    }

    @When("^selects \"([^\"]*)\" as interested traffic$")
    public void selects_as_interested_traffic(String arg1) {
        yourDetails.clickOnFixedTariff();
    }

    @When("^clicks on \"([^\"]*)\" as way of payment$")
    public void clicks_on_as_way_of_payment(String arg1) {
        yourDetails.clickOnMonthlyDirectDebit();
    }

    @When("^enters a valid \"([^\"]*)\"$")
    public void enters_a_valid(String arg1) {
        yourDetails.enterEmail();
    }

    @When("^clicks on I confirm for  the Terms and Conditions$")
    public void clicks_on_I_confirm_for_the_Terms_and_Conditions(){
        yourDetails.clickOnConfirmationButton();
    }

    @When("^clicks on Go to Prices button$")
    public void clicks_on_Go_to_Prices_button() {
        yourDetails.clickOnGoToPrices();
    }

    @Then("^User is navigated to Your Results Page$")
    public void user_is_navigated_to_Your_Results_Page() {
        yourResult.validateTittle();
    }


    @When("^User inputs an invalid \"([^\"]*)\"$")
    public void user_inputs_an_invalid(String arg1) {
        yourSupplier.enterInvalidPoscode();
    }

    @When("^system does not validates the postcode and shows an error message display$")
    public void system_does_not_validates_the_postcode_and_shows_an_error_message_display() {
        yourSupplier.validateErrorMessage();

    }

    @Then("^user is not able to navigate to Your Energy No Bill Page$")
    public void user_is_not_able_to_navigate_to_Your_Energy_No_Bill_Page() {
        yourSupplier.userSeesErrorMsgAndIsNotNavigatedFurther();
    }

    @When("^user clicks on how to get started option$")
    public void user_clicks_on_how_to_get_started_option() {
        yourSupplier.clickOnHowToGetStartedLink();

    }

    @Then("^User get to sees brief summary to explain further steps$")
    public void user_get_to_sees_brief_summary_to_explain_further_steps() {
        yourSupplier.validateHowToGetstartedTextBox();
    }




}
