package tests;

import io.qameta.allure.Description;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPageConstructor;
import pageObject.ProfilePage;
import static org.junit.Assert.assertEquals;
public class ExitTest extends BaseTest {
    private static final MainPageConstructor mainPageConstructor = new MainPageConstructor();
    private static final ProfilePage profilePage = new ProfilePage();
    private static final LoginPage loginPage = new LoginPage();
    private static final String EXPECTED_LOGIN_TITLE = "Вход";

    @Test
    @Description("Выход из профиля")
    public void exit(){
        mainPageConstructor.clickEnter();
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        profilePage.clickExitButton();
        String actualLoginTitle = loginPage.getEnterTitle();
        assertEquals(EXPECTED_LOGIN_TITLE, actualLoginTitle);
    }
}
