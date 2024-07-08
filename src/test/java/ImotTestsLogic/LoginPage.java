package ImotTestsLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private By enterTab = By.xpath("//a[@class=\"selected\"]");
    private By radioBtnUsers = By.xpath("//input[@value=\"2\"]");
    private By emailField = By.xpath("//input[@name=\"usr\"]");
    private By passwordField = By.xpath("//input[@type=\"password\"]");
    private By rememberMeCheckBox = By.xpath("//input[@name=\"remember_login\"]");
    private By loginBtn = By.xpath("//a[@class=\"loginButton\"]");

    public By getEnterTab() {
        return enterTab;
    }

    public By getRadioBtnUsers() {
        return radioBtnUsers;
    }

    public By getEmailField() {
        return emailField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getRememberMeCheckBox() {
        return rememberMeCheckBox;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public void clickElement(ChromeDriver driver, By element) {
        driver.findElement(element).click();
    }

    public void sendKeys(ChromeDriver driver, By element, String enterText) {
        driver.findElement(element).sendKeys(enterText);
    }

    public String getText(ChromeDriver driver, By element) {
        return driver.findElement(element).getText();
    }
}
