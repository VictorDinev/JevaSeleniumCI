package Driver;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

public class chromeDriver {

    private static final String BASEURL = "https://imot.bg/";

    private static ChromeDriver driver = new ChromeDriver();

    private chromeDriver(){};

    public static ChromeDriver getDriver() {

        driver.get(BASEURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
