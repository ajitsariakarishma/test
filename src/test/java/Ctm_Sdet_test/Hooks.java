package Ctm_Sdet_test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Ctm_Sdet_test.utils.randomDate;
import static com.sun.deploy.cache.Cache.copyFile;


public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties props = new LoadProperties();



    @Before
    public void initializeTest(){

        browserSelector.setUpBrowser();
        driver.get(props.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @After
    public void screenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails) as well as stores it in a folder in the framework

                System.out.println("\"Scenario FAILED... screen shot taken");
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"image/png");

                final File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenShot, new File("src\\test\\java\\Resources\\Screenshots" + System.currentTimeMillis()+"\\testfailed.png"));

            }catch (WebDriverException somePlatformsDontSupportScreenshots){
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());

            }

        }

        driver.close();
    }

}
