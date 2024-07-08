package ImotTestsLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageV2 {

    private By proceedBtn;
    private By map;
    private By mapContinueBtn;
    private By typeOfSearch;
    private By selectLocation;
    private By selectArrow;
    private By maxPriceBox;
    private By searchBtn;
    private By resultLabel;

    protected MainPageV2(By proceedBtn, By map, By mapContinueBtn, By typeOfSearch, By selectLocation, By selectArrow, By maxPriceBox, By searchBtn, By resultLabel) {
        this.proceedBtn = proceedBtn;
        this.map = map;
        this.mapContinueBtn = mapContinueBtn;
        this.typeOfSearch = typeOfSearch;
        this.selectLocation = selectLocation;
        this.selectArrow = selectArrow;
        this.maxPriceBox = maxPriceBox;
        this.searchBtn = searchBtn;
        this.resultLabel = resultLabel;
    }

    public By getProceedBtn() {
        return proceedBtn;
    }

    public By getMap() {
        return map;
    }

    public By getMapContinueBtn() {
        return mapContinueBtn;
    }

    public By getTypeOfSearch() {
        return typeOfSearch;
    }

    public By getSelectLocation() {
        return selectLocation;
    }

    public By getSelectArrow() {
        return selectArrow;
    }

    public By getMaxPriceBox() {
        return maxPriceBox;
    }

    public By getSearchBtn() {
        return searchBtn;
    }

    public By getResultLabel() {
        return resultLabel;
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
