import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kakuffo on 17/09/15.
 */
public class WebDriverTest {

    private static org.openqa.selenium.WebDriver driver = null;

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/login.html");


        driver.quit();

    }
}
