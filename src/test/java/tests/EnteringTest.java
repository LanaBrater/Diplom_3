package tests;

import pageObject.LoginPage;
import pageObject.MainPageConstructor;
import pageObject.ProfilePage;
import pageObject.RegistrationPage;
import io.qameta.allure.Description;
import org.junit.Test;
import utilites.DriverUtil;
import static org.junit.Assert.assertEquals;
public class EnteringTest extends BaseTest {
    private static final MainPageConstructor mainPageConstructor = new MainPageConstructor();
    private static final RegistrationPage registrationPage = new RegistrationPage();
    private static final ProfilePage profilePage = new ProfilePage();
    private static final LoginPage loginPage = new LoginPage();
    private static final String EXPECTED_PROFILE_TEXT = "В этом разделе вы можете изменить свои персональные данные";
    private static final String REGISTER_URL = "https://stellarburgers.nomoreparties.site/register";
    private static final String RESET_PASSWD_URL = "https://stellarburgers.nomoreparties.site/reset-password";

    @Test
    @Description("Вход через главную страницу")
    public void enterViaMainPage() {
        mainPageConstructor.clickEnter();
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        String actualProfileText = profilePage.getProfileText();
        assertEquals(EXPECTED_PROFILE_TEXT, actualProfileText);
    }

    @Test
    @Description("Вход через профиль")
    public void enterViaProfile() {
        mainPageConstructor.clickEnter();
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        String actualProfileText = profilePage.getProfileText();
        assertEquals(EXPECTED_PROFILE_TEXT, actualProfileText);
    }

    @Test
    @Description("Вход через регистрацию")
    public void enterViaRegister() throws InterruptedException {
        DriverUtil.getDriver().get(REGISTER_URL);
        registrationPage.clickEnterButton();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        Thread.sleep(2000);
        String actualProfileText = profilePage.getProfileText();
        assertEquals(EXPECTED_PROFILE_TEXT, actualProfileText);
    }

    @Test
    @Description("Вход через восстановление пароля")
    public void enterViaResetPassword() {
        DriverUtil.getDriver().get(RESET_PASSWD_URL);
        registrationPage.clickEnterButton();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        String actualProfileText = profilePage.getProfileText();
        assertEquals(EXPECTED_PROFILE_TEXT, actualProfileText);
    }
}
