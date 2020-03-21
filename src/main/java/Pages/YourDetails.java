package Pages;

import Ctm_Sdet_test.LoadProperties;
import Ctm_Sdet_test.utils;
import org.openqa.selenium.By;

public class YourDetails extends utils {
     LoadProperties props = new LoadProperties();

     private By _fixedTariffTab = By.xpath("//span[@class='icon energy-gas-electricity fixed-rate-1']");
     private By  _monthlyDirectDebit = By.xpath("//span[@class='icon energy-gas-electricity annual-1']");
     private By _enterEmail = By.id("Email");
     private By _confirmationButton = By.xpath("//span[@class='checkbox-confirm']");
     private By _goToPricesButton = By.id("email-submit");

    public void validateTittle(){
        validateTittle(props.getProperty("expectedYourTittle"));
    }
    public void clickOnFixedTariff(){
        clickElement(_fixedTariffTab);
    }
    public void clickOnMonthlyDirectDebit(){
        clickElement(_monthlyDirectDebit);
    }
    public void enterEmail(){
        enterText(_enterEmail,props.getProperty("email"));
    }
    public void clickOnConfirmationButton(){
        clickElement(_confirmationButton);
    }
    public void clickOnGoToPrices(){
        clickElement(_goToPricesButton);
    }

}
