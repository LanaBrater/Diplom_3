package tests;

import org.junit.After;
import org.junit.Before;
import pojo.User;
import utilites.DriverUtil;
import utilites.RandomUserGenerator;
import utilites.UserAuth;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static User user;
    private static final String URL = "https://stellarburgers.nomoreparties.site";

    @Before
    public void beforeTest(){
        user =  new RandomUserGenerator().getRandomUser();
        new UserAuth().createUser(user);
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverUtil.getDriver().get(URL);
    }

    @After
    public void tearDown() {
        DriverUtil.getDriver().quit();
        DriverUtil.deleteDriver();
    }
}
