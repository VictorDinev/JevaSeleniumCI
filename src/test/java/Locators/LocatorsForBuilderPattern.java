package Locators;

import org.openqa.selenium.By;

public class LocatorsForBuilderPattern {

    private By proceedBtn = By.xpath("//button[@class=\"fc-button fc-cta-consent fc-primary-button\"]");
    private By map = By.id("BG-22");
    private By mapContinueBtn = By.xpath("//a[@class=\"mapBtnProdajbi\"]");
    private By typeOfSearch = By.id("vi18");
    private By selectLocation = By.xpath("//select[@class=\"sw185\"]/option[@value=\"с. Нови хан\"]");
    private By selectArrow = By.xpath("//img[@src=\"../images/picturess/arrow_down.gif\"]");
    private By maxPriceBox = By.xpath("//input[@class=\"sw70\"][@name=\"f29\"]");
    private By searchBtn = By.xpath("//input[@value=\"Т Ъ Р С И\"]");
    private By resultLabel = By.xpath("//div[@style=\"font-weight:bold;\"]");

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
}
