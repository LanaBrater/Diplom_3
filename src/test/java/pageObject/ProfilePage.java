package pageObject;

import org.openqa.selenium.By;
import utilites.DriverUtil;

public class ProfilePage {

    private static final By EXIT_BUTTON = By.xpath("//div/main/div/nav/ul/li[3]/button");
    private static final By PROFILE_TEXT = By.xpath("//*[@id='root']/div/main/div/nav/p");



    public void clickExitButton(){
        DriverUtil.getDriver().findElement(EXIT_BUTTON).click();
    }

    public String getProfileText(){
        return DriverUtil.getDriver().findElement(PROFILE_TEXT).getText();
    }
}
