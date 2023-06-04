package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilites.DriverUtil;

public class RegistrationPage {

    private static final By NAME_FIELD = By.xpath(".//fieldset[1]/div/div/input[@class='text input__textfield text_type_main-default' and @name='name']");
    private static final By EMAIL_FIELD = By.xpath("//*[@id='root']/div/main/div/form/fieldset[2]/div/div/input");
    private static final By PASSWORD_FIELD = By.xpath("//*[@id='root']/div/main/div/form/fieldset[3]/div/div/input");
    private static final By REGISTRATION_BUTTON = By.xpath("//*[@id='root']/div/main/div/form/button");
    private static final By ENTER_BUTTON = By.xpath("//*[@id='root']/div/main/div/div/p/a");
    private static final By INVALID_PASSWORD_MESSAGE = By.xpath("//div/main/div/form/fieldset[3]/div/p");

    public void clickNameField(){
        DriverUtil.getDriver().findElement(NAME_FIELD).click();
    }
    public void inputName(String string){
        DriverUtil.getDriver().findElement(NAME_FIELD).sendKeys(string);
    }
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

    public void clickRegistrationButton(){
        DriverUtil.getDriver().findElement(REGISTRATION_BUTTON).click();
    }
    public void clickEnterButton(){
        DriverUtil.getDriver().findElement(ENTER_BUTTON).click();
    }

    public String checkInvalidPasswordMessage(){
        return DriverUtil.getDriver().findElement(INVALID_PASSWORD_MESSAGE).getText();
    }
}