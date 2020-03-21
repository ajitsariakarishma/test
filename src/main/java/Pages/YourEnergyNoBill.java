package Pages;

import Ctm_Sdet_test.LoadProperties;
import Ctm_Sdet_test.utils;
import org.openqa.selenium.By;

public class YourEnergyNoBill extends utils {

    LoadProperties props = new LoadProperties();

    private By _noPayAsYouGo = By.xpath("//*[@id=\"prepay-yes-no\"]/div/div/label[2]");
    private By _noEconomy7Meter = By.xpath("//*[@id=\"economy-7-question\"]/div/div/label[2]");
    private By _electricitySpend = By.id("electricity-current-spend");
    private By _gasSpend = By.name("gas-current-spend");
    private By _dropdownForElectricity = By.id("electricity-current-spend-period");
    private By _dropdownForGas = By.id("gas-current-spend-period");
    private By _nextButton = By.xpath("//button[@id='goto-your-energy']");



    public void validatetittle(){
        validateTittle(props.getProperty("expectedYourTittle"));
    }
    public void clickOnNoForPAymentPAyAsYoyGo(){
        clickElement(_noPayAsYouGo);

    }
    public void clickOnNoForEconomy7Meter(){
        clickElement(_noEconomy7Meter);
    }
    public void inputPriceForElectricity(){
        enterText(_electricitySpend,"50" );
    }
    public void selectPlanForElectricity(){
        handlingDropdownByValue(_dropdownForElectricity,"string:Monthly");

    }
    public void inputPriceForGas(){
        enterText(_gasSpend,"40" );
    }
    public void selectPlanForGas(){
        handlingDropdownByValue(_dropdownForGas,"string:Monthly");
    }
    public void clickOnNextButton(){
        clickElement(_nextButton);
    }
}
