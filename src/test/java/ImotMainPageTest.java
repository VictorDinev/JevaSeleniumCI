import ImotTestsLogic.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.chromeDriver.getDriver;
import static ImotTestsLogic.MainPage.*;
import static Locators.Locators.*;


public class ImotMainPageTest {

    ChromeDriver driver = getDriver();
    MainPage testlogic = new MainPage();

    @Test
    public void OpenMainPage() {

        String expectedText = "Резултат от Вашето търсене на:";
        String actualText = testlogic.mainPageTest(driver);

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void testSearch(){



        MainPage.waitForCokies(driver, proceedBtn,10);
        clickElement(driver,proceedBtn);
        clickElement(driver,map);
        clickElement(driver,mapContinueBtn);
        clickElement(driver,typeOfSearch);
        clickElement(driver,selectLocation);
        clickElement(driver,selectArrow);
        sendKeys(driver,maxPriceBox,"320000");
        clickElement(driver,searchBtn);
       String labelText = getText(driver,resultLabel);
        String expectedText = "Резултат от Вашето търсене на:";
        Assert.assertEquals(labelText,expectedText);
    }

}
