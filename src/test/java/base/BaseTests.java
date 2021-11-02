package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import java.time.Duration;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BaseTests {

    private ChromeDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver",);
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        goHome();
       homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public  void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()) 
        {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("_dd-MM-yyyy__HH:mm:ss");
                Date date = new Date();
                //Date date=java.util.Calendar.getInstance().getTime();
                Files.move(screenshot, new File("/Users/perlams/IdeaProjects/webdriver_java/src/main/resources/screenshots/" + result.getName() + formatter.format(date) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowsManager getWindowManager(){
        return new WindowsManager(driver);

    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setHeadless(true);
        return options;
    }

}
