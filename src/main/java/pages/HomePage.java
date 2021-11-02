package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;

    private By formAuthenticationLink =By.linkText("Form Authentication");
    private  By forgotPasswordLink = By.linkText("Forgot Password");

    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public IFramePage clickIFrameLink(){
        clickLink("WYSIWYG Editor");
        return new IFramePage(driver);
    }

    public FramePage clickFrameLink(){
        clickLink("Frames");
        return new FramePage(driver);
    }

    public  KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return  new KeyPressesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDownLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

    public  HorizontalSliderPage clickHorizontalSlideLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public  AlertsPage clickAlertsLink(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public ModalPage clickModalLink(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public  FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

}
