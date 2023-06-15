package pageObject;

import org.openqa.selenium.By;
import utilites.DriverUtil;

public class MainPageConstructor {

    private static final By PROFILE = By.xpath("//div/header/nav/a/p");
    private static final By ENTER = By.xpath("//div/main/section[2]/div/button");
    private static final By CONSTRUCTOR = By.xpath("//div/header/nav/ul/li[1]/a/p");
    private static final By LOGO = By.xpath("//div/header/nav/div/a");
    private static final By BREAD = By.xpath("//div/main/section[1]/div[1]/div[1]");
    private static final By BREAD_TITLE = By.xpath("//div/main/section[1]/div[2]/h2[1]");
    private static final By SAUCE = By.xpath("//div/main/section[1]/div[1]/div[2]");
    private static final By SAUCE_TITLE = By.xpath("//div/main/section[1]/div[2]/h2[2]");
    private static final By FILLING = By.xpath("//div/main/section[1]/div[1]/div[3]");
    private static final By FILLING_TITLE = By.xpath("//div/main/section[1]/div[2]/h2[3]");
    private static final By TITLE_TEXT = By.xpath("//div/main/section[1]/h1");

    public void clickProfile() {
        DriverUtil.getDriver().findElement(PROFILE).click();
    }

    public void clickEnter() {
        DriverUtil.getDriver().findElement(ENTER).click();
    }

    public void clickConstructor() {
        DriverUtil.getDriver().findElement(CONSTRUCTOR).click();
    }

    public void clickLogo() {
        DriverUtil.getDriver().findElement(LOGO).click();
    }

    public void chooseBread() {
        DriverUtil.getDriver().findElement(BREAD).click();
    }

    public String getBreadTitle(){
        return DriverUtil.getDriver().findElement(BREAD_TITLE).getText();
    }

    public void chooseSauce() {
        DriverUtil.getDriver().findElement(SAUCE).click();
    }

    public String getSauceTitle(){
        return DriverUtil.getDriver().findElement(SAUCE_TITLE).getText();

    }

    public void chooseFilling() {
        DriverUtil.getDriver().findElement(FILLING).click();
    }

    public String getFillingTitle(){
        return DriverUtil.getDriver().findElement(FILLING_TITLE).getText();
    }

    public String getTitle(){
        return DriverUtil.getDriver().findElement(TITLE_TEXT).getText();
    }
}
