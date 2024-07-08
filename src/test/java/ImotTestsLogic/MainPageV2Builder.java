package ImotTestsLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageV2Builder {

    private By proceedBtn;
    private By map;
    private By mapContinueBtn;
    private By typeOfSearch;
    private By selectLocation;
    private By selectArrow;
    private By maxPriceBox;
    private By searchBtn;
    private By resultLabel;

    public MainPageV2Builder proceedBtn(By proceedBtn) {
        this.proceedBtn = proceedBtn;
        return this;
    }

    public MainPageV2Builder map(By map) {
        this.map = map;
        return this;
    }

    public MainPageV2Builder mapContinueBtn(By mapContinueBtn) {
        this.mapContinueBtn = mapContinueBtn;
        return this;
    }

    public MainPageV2Builder typeOfSearch(By typeOfSearch) {
        this.typeOfSearch = typeOfSearch;
        return this;
    }

    public MainPageV2Builder selectLocation(By selectLocation) {
        this.selectLocation = selectLocation;
        return this;
    }

    public MainPageV2Builder selectArrow(By selectArrow) {
        this.selectArrow = selectArrow;
        return this;
    }

    public MainPageV2Builder maxPriceBox(By maxPriceBox) {
        this.maxPriceBox = maxPriceBox;
        return this;
    }

    public MainPageV2Builder searchBtn(By searchBtn) {
        this.searchBtn = searchBtn;
        return this;
    }

    public MainPageV2Builder resultLabel(By resultLabel) {
        this.resultLabel = resultLabel;
        return this;
    }

    public MainPageV2 build() {
        return new MainPageV2(proceedBtn, map, mapContinueBtn, typeOfSearch, selectLocation, selectArrow, maxPriceBox, searchBtn, resultLabel);
    }

    public void clickElement(ChromeDriver driver, By element) {

        driver.findElement(element).click();
    }

    public void waitForCokies(ChromeDriver driver, By element, int durationInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(proceedBtn));
    }

    public void sendKeys(ChromeDriver driver, By locator, String sendKeys) {
        driver.findElement(locator).sendKeys(sendKeys);
    }

    public String getText(ChromeDriver driver, By locator) {
        String textFromElement = driver.findElement(locator).getText();
        return textFromElement;
    }

}
