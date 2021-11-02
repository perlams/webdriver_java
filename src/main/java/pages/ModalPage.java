package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage {

    private WebDriver driver;
    private By closeLink = By.cssSelector("div.modal-footer p");
    private By modalTitle = By.cssSelector("div.modal-title h3");

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getText(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalTitle));
        return driver.findElement(modalTitle).getText();
    }

    public void closeModal(){
        driver.findElement(closeLink).click();
    }

}
