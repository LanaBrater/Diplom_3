package tests;

import pageObject.LoginPage;
import pageObject.MainPageConstructor;
import pageObject.ProfilePage;
import io.qameta.allure.Description;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProfileTest extends BaseTest {
    private static final MainPageConstructor mainPageConstructor = new MainPageConstructor();
    private static final ProfilePage profilePage = new ProfilePage();
    private static final LoginPage loginPage = new LoginPage();
    private static final String EXPECTED_PROFILE_TEXT = "В этом разделе вы можете изменить свои персональные данные";
    private static final String EXPECTED_TITLE_TEXT = "Соберите бургер";

    @Test
    @Description("Переход на страницу профиля")
    public void clickProfile(){
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
    @Description("Нажатие на кнопку Конструктор")
    public void clickConstructor(){
        mainPageConstructor.clickEnter();
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        mainPageConstructor.clickConstructor();
        String actualTitleText = mainPageConstructor.getTitle();
        assertEquals(EXPECTED_TITLE_TEXT, actualTitleText);
    }

    @Test
    @Description("Нажатие на лого")
    public void clickLogo(){
        mainPageConstructor.clickEnter();
        loginPage.clickEmailField();
        loginPage.inputEmail(user.getEmail());
        loginPage.clickPasswordField();
        loginPage.inputPassword(user.getPassword());
        loginPage.clickEnterButton();
        mainPageConstructor.clickProfile();
        mainPageConstructor.clickLogo();
        String actualTitleText = mainPageConstructor.getTitle();
        assertEquals(EXPECTED_TITLE_TEXT, actualTitleText);
    }
}
