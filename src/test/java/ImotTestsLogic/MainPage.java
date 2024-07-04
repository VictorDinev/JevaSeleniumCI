package ImotTestsLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Locators.Locators.*;

public class MainPage {


    WebDriverWait wait;

    public static void clickElement(ChromeDriver driver, By element) {

        driver.findElement(element).click();
    }

    public static void waitForCokies(ChromeDriver driver, By element, int durationInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(proceedBtn));
    }

    public static void sendKeys(ChromeDriver driver, By locator, String sendKeys) {
        driver.findElement(locator).sendKeys(sendKeys);
    }

    public static String getText(ChromeDriver driver, By locator) {
        String textFromElement = driver.findElement(locator).getText();
        return textFromElement;
    }

    public String mainPageTest(ChromeDriver driver) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(proceedBtn));

        driver.findElement(proceedBtn).click();
        driver.findElement(map).click();
        driver.findElement(mapContinueBtn).click();
        driver.findElement(typeOfSearch).click();
        driver.findElement(selectLocation).click();
        driver.findElement(selectArrow).click();
        driver.findElement(maxPriceBox).sendKeys("300000");
        driver.findElement(searchBtn).click();
        String resutlLabelText = driver.findElement(resultLabel).getText();
        return resutlLabelText;
    }


}
