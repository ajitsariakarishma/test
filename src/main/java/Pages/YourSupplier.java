package Pages;

import Ctm_Sdet_test.LoadProperties;
import Ctm_Sdet_test.utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class YourSupplier extends utils {

    LoadProperties props = new LoadProperties();

  private  By _inputPostCode = By.cssSelector("#your-postcode");
  private  By _findPostCodeButton = By.id("find-postcode");
  private By _dontHaveBillOption = By.xpath("//span[contains(text(),'t have my bill')]");
  private By _gasAndElectricityOption = By.xpath("//span[@class='icon energy-gas-electricity']");
  private By _nextButton = By.id("goto-your-supplier-details");
  private By _dontKnowButtonForElectricty = By.className("checkbox-confirm");
  private By _dontKnowButtonForGas = By.xpath("//label[@class='gas-supplier-dont-know']" +
          "//span[@class='checkbox-confirm'][contains(text(),'t know')]");
  private By _errorMessageText = By.xpath("//div[@class='error ng-binding']");
  private By _errorMsg = By.xpath("//p[@id='get-started-view-status']");
  private By _viewQuestionLink = By.xpath("//a[@class='arrow-before']");
  private By _howToGetstartedLink = By.xpath("//button[@id='journey-introduction-button']");
  private By _guidelinesToStartText = By.xpath("//div[@class='journey-introduction-panel-inner ng-scope']");


    public void validateUrl(){
      //Asserting that user had landed on desired page
      validateUrl(props.getProperty("expectedSupplierPageUrl"));
  }

  public void enterPostCode(){

      enterText(_inputPostCode,props.getProperty("postcode"));

  }
  public void clickOnSearchPostcode(){
      clickElement(_findPostCodeButton);

  }
 public void clickOnIDontHaveMyBillButton(){
      clickElement(_dontHaveBillOption);
 }
 public void clickOnGasAndElectricityTab(){
      clickElement(_gasAndElectricityOption);

 }
 public void clickonIDontKnowForElectricity(){
   clickElement(_dontKnowButtonForElectricty);
 }
    public void clickonIDontKnowForGas(){
        clickElement(_dontKnowButtonForGas);
    }
    public void clickonNextButton(){
        clickElement(_nextButton);
    }

     public void enterInvalidPoscode() {
         enterText(_inputPostCode, props.getProperty("invalidPostCode"));
     }
     public void validateErrorMessage(){
       waitForElementVisible(_errorMessageText,5);
       String actualErrorMessage;
         actualErrorMessage = getTextFromElement(_errorMessageText);
         Assert.assertEquals(actualErrorMessage,props.getProperty("expectedErroeMsg"));


     }
     public void userSeesErrorMsgAndIsNotNavigatedFurther(){
        waitForElementVisible(_errorMsg,5);
        clickElement(_viewQuestionLink);

     }
     public void clickOnHowToGetStartedLink(){
        clickElement(_howToGetstartedLink);
     }

     public void validateHowToGetstartedTextBox(){
        waitForElementVisible(_guidelinesToStartText,5);
       String tips =getTextFromElement(_guidelinesToStartText);
       if(tips.contains("See how much you could save")){
           boolean result = true;
           Assert.assertTrue(result);
           System.out.println("tips are displayed correctly");
       }else{
              System.out.println("tips not displayed ");
              Assert.assertTrue(false);

       }



     }



}


