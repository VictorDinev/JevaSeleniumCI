package Locators;

import org.openqa.selenium.By;

public class Locators {

    public static By proceedBtn = By.xpath("//button[@class=\"fc-button fc-cta-consent fc-primary-button\"]");
    public static By map = By.id("BG-22");
    public static By mapContinueBtn = By.xpath("//a[@class=\"mapBtnProdajbi\"]");
    public static By typeOfSearch = By.id("vi18");
    public static By selectLocation = By.xpath("//select[@class=\"sw185\"]/option[@value=\"с. Нови хан\"]");
    public static By selectArrow = By.xpath("//img[@src=\"../images/picturess/arrow_down.gif\"]");
    public static By maxPriceBox = By.xpath("//input[@class=\"sw70\"][@name=\"f29\"]");
    public static By searchBtn = By.xpath("//input[@value=\"Т Ъ Р С И\"]");
    public static By resultLabel = By.xpath("//div[@style=\"font-weight:bold;\"]");

}
