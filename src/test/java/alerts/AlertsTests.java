package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    private WebDriver driver;

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        String  result = alertsPage.getResult();
        assertEquals(result,"You successfully clicked an alert" ,"Wrong message for alert");

    }

    @Test
    public void  testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDIsmiss();
        assertEquals(text,"I am a JS Confirm", "Wrong error confirm" );
    }

    @Test
    public  void  testInputFromPrompt(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerPrompt();
        String text = "Anything";
        alertsPage.alert_setInputText(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: "+ text, "Results incorrect" );
    }


}
