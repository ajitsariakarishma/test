package Ctm_Sdet_test;




import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

import static Ctm_Sdet_test.BasePage.driver;


public class utils extends BasePage {

    public static String randomDate() {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("ddMMyyHHmmss");
        return simpledateformat.format(new Date());


    }
    public static void validateUrl(String expectedUrl){
        String currentUrl =driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,expectedUrl,"Url doesnot match");


    }
    public static void validateTittle(String expectedTittle){

        String currentTittle =driver.getTitle();
        System.out.println(currentTittle);
        Assert.assertEquals(currentTittle,expectedTittle,"Tittle doesnot match");


    }
    // click on web element
    public static void clickElement(By by) {
        driver.findElement(by).click();

    }
    //Enter text in input field
    public static void enterText(By by, String text) {
        clickElement(by);
        driver.findElement(by).sendKeys(text);

    }
    //Handling dropdown by visible text
    public static void handlingDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    //handling dropdown by value
    public static void handlingDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //handling dropdown by index number
    public static void handlingDropdownByIndex(By by, int index_num) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index_num);
    }

    // wait for element to be visiable
    public static void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    // get text from  location
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }









}
