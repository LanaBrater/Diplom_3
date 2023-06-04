package tests;

import pageObject.MainPageConstructor;
import io.qameta.allure.Description;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class
ConstructorTest extends BaseTest {
    private static final MainPageConstructor mainPageConstructor = new MainPageConstructor();
    private static final String EXPECTED_BREAD_TITLE = "Булки";
    private static final String EXPECTED_SAUCE_TITLE = "Соусы";
    private static final String EXPECTED_FILLING_TITLE = "Начинки";

    @Test
    @Description("Выбор таба Булки")
    public void chooseBreadTab(){
        mainPageConstructor.chooseSauce();
        mainPageConstructor.chooseBread();
        String actualBreadTitle = mainPageConstructor.getBreadTitle();
        assertEquals(EXPECTED_BREAD_TITLE, actualBreadTitle);
    }

    @Test
    @Description("Выбор таба Соусы")
    public void chooseSauceTab() {
        mainPageConstructor.chooseSauce();
        String actualSauceTitle = mainPageConstructor.getSauceTitle();
        assertEquals(EXPECTED_SAUCE_TITLE, actualSauceTitle);
    }

    @Test
    @Description("Выбор таба Начинки")
    public void chooseFillingTab(){
        mainPageConstructor.chooseFilling();
        String actualFillingTitle = mainPageConstructor.getFillingTitle();
        assertEquals(EXPECTED_FILLING_TITLE, actualFillingTitle);
    }
}
