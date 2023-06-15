package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilites.DriverUtil;

public class LoginPage {
    private static final By EMAIL_FIELD = By.xpath("//*[@id='root']/div/main/div/form/fieldset[1]/div/div/input");
    private static final By PASSWORD_FIELD = By.xpath("//*[@id='root']/div/main/div/form/fieldset[2]/div/div/input");
    private static final By ENTER_BUTTON = By.xpath("//*[@id='root']/div/main/div/form/button");
    private static final By REGISTRATION_BUTTON = By.xpath("//*[@id='root']/div/main/div/div/p[1]/a");
    private static final By PASSWORD_RECOVERY_BUTTON = By.xpath("//div/main/div/div/p[2]/a");
    private static final By ENTER_TITLE = By.xpath("//div/main/div/h2");


    public void clickEmailField(){
        DriverUtil.getDriver().findElement(EMAIL_FIELD).click();
    }
    public void inputEmail(String string){
        DriverUtil.getDriver().findElement(EMAIL_FIELD).sendKeys(string);
    }
    public void clickPasswordField(){
        DriverUtil.getDriver().findElement(PASSWORD_FIELD).click();
    }
    public void inputPassword(String string){
        DriverUtil.getDriver().findElement(PASSWORD_FIELD).sendKeys(string);
    }

    public void clickEnterButton(){
        DriverUtil.getDriver().findElement(ENTER_BUTTON).click();
    }

    public void clickRegistrationButton(){
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        DriverUtil.getDriver().findElement(REGISTRATION_BUTTON).click();
    }
    public void clickPasswordRecoveryButton(){
        DriverUtil.getDriver().findElement(PASSWORD_RECOVERY_BUTTON).click();
    }
    public String getEnterTitle(){
        return DriverUtil.getDriver().findElement(ENTER_TITLE).getText();

    }
}
