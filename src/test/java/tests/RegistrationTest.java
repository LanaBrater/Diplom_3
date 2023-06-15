package tests;

import pageObject.LoginPage;
import pageObject.MainPageConstructor;
import pageObject.ProfilePage;
import pageObject.RegistrationPage;
import io.qameta.allure.Description;
import org.junit.Test;
import pojo.User;
import utilites.RandomUserGenerator;
import static org.junit.Assert.assertEquals;

public class RegistrationTest extends BaseTest {
    private static final MainPageConstructor mainPageConstructor = new MainPageConstructor();
    private static final RegistrationPage registrationPage = new RegistrationPage();
    private static final LoginPage loginPage = new LoginPage();
    private static final ProfilePage profilePage = new ProfilePage();
    private static final String EXPECTED_PROFILE_TEXT = "В этом разделе вы можете изменить свои персональные данные";
    private static final String EXPECTED_ERROR_MESSAGE = "Некорректный пароль";
    private static final String INVALID_PASS = "123";

    @Test
    @Description("Успешная регистрация")
    public void successfulRegistration() throws InterruptedException {
        User user =  new RandomUserGenerator().getRandomUser();
        mainPageConstructor.clickProfile();
        loginPage.clickRegistrationButton();
        registrationPage.clickNameField();
        registrationPage.inputName(user.getName());
        registrationPage.clickEmailField();
        registrationPage.inputEmail(user.getEmail());
        registrationPage.clickPasswordField();
        registrationPage.inputPassword(user.getPassword());
        registrationPage.clickRegistrationButton();
        Thread.sleep(2000);
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        Thread.sleep(2000);
        mainPageConstructor.clickProfile();
        String actualProfileText = profilePage.getProfileText();
        assertEquals(EXPECTED_PROFILE_TEXT, actualProfileText);
    }

    @Test
    @Description("Регистрация с невалидным паролем")
    public void registrationWithInvalidPassword() {
        mainPageConstructor.clickProfile();
        loginPage.clickRegistrationButton();
        registrationPage.clickNameField();
        registrationPage.inputName(user.getName());
        registrationPage.clickEmailField();
        registrationPage.inputEmail(user.getEmail());
        registrationPage.clickPasswordField();
        registrationPage.inputPassword(INVALID_PASS);
        registrationPage.clickRegistrationButton();
        String actualErrorMessage = registrationPage.checkInvalidPasswordMessage();
        assertEquals(EXPECTED_ERROR_MESSAGE, actualErrorMessage);
    }
}
