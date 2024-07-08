import ImotTestsLogic.MainPageV2;
import ImotTestsLogic.MainPageV2Builder;
import Locators.LocatorsForBuilderPattern;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.chromeDriver.getDriver;

public class ImorMainPageTestBuilderPattern {

    String expectedlabel = "Резултат от Вашето търсене на:";

    ChromeDriver driver = getDriver();
    LocatorsForBuilderPattern locators = new LocatorsForBuilderPattern();


    @Test
    public void mainPageBuilderTest() {

        MainPageV2 imotMainPage = new MainPageV2Builder()
                .proceedBtn(locators.getProceedBtn())
                .map(locators.getMap())
                .mapContinueBtn(locators.getMapContinueBtn())
                .typeOfSearch(locators.getTypeOfSearch())
                .selectLocation(locators.getSelectLocation())
                .selectArrow(locators.getSelectArrow())
                .maxPriceBox(locators.getMaxPriceBox())
                .searchBtn(locators.getSearchBtn())
                .resultLabel(locators.getResultLabel())
                .build();

        imotMainPage.waitForCokies(driver, imotMainPage.getProceedBtn(), 10);
        imotMainPage.clickElement(driver, imotMainPage.getProceedBtn());
        imotMainPage.clickElement(driver, imotMainPage.getMap());
        imotMainPage.clickElement(driver, imotMainPage.getMapContinueBtn());
        imotMainPage.clickElement(driver, imotMainPage.getTypeOfSearch());
        imotMainPage.clickElement(driver, imotMainPage.getSelectLocation());
        imotMainPage.clickElement(driver, imotMainPage.getSelectArrow());
        imotMainPage.clickElement(driver, imotMainPage.getMaxPriceBox());
        imotMainPage.clickElement(driver, imotMainPage.getSearchBtn());
        String actualLabel = imotMainPage.getText(driver, imotMainPage.getResultLabel());

        Assert.assertEquals(actualLabel, expectedlabel);
    }

}
