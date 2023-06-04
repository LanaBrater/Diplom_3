package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {
    private static WebDriver driver;
    private static String browser = "yandexBrowser";

    public static WebDriver getDriver() {
        if (browser.equals("chrome")) {
            if (driver == null) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

        }
        if (browser.equals("yandexBrowser")) {
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.setBinary("C:\\Users\\brate\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
                driver = new ChromeDriver(options);

            }
        }
        return driver;
    }


    public static void deleteDriver() {
        driver = null;
    }
}
