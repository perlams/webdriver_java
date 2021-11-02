package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void contextClick(){
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();

    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();

    }

    public String getText(){
        return driver.switchTo().alert().getText();
    }

}
