package ImotTestsLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

    private By selectRegisterTab = By.xpath("//a[@class=\"selected\"]");
    private By emailField = By.xpath("//input[@name=\"email\"]");
    private By passwordField = By.xpath("//input[@name=\"passw\"]");
    private By repeatPasswordField = By.xpath("//input[@name=\"passc\"]");
    private By termsOfUseBox = By.xpath("//input[@name=\"agree\"]");
    private By RegisterBtn = By.xpath("//a[@href=\"javascript:document.registration.submit();\"]");
    private By successMessage = By.xpath("//div[@class=\"sendPassInfo\"]");

    private String expectedTabText = "Нова Регистрация";
    private String userMail;
    private String expectedSuccessfulRegisterMsg = "На " + "userMail" + " е изпратен мейл за потвърждение на регистрацията.";


    public By getSelectRegisterTab() {
        return selectRegisterTab;
    }

    public By getEmailField() {
        return emailField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getRepeatPasswordField() {
        return repeatPasswordField;
    }

    public By getTermsOfUseBox() {
        return termsOfUseBox;
    }

    public String getExpectedTabText() {
        return expectedTabText;
    }

    public By getRegisterBtn() {
        return RegisterBtn;
    }

    public By getSuccessMessage() {
        return successMessage;
    }

    public String getExpectedSuccessfulRegisterMsg() {
        return expectedSuccessfulRegisterMsg.replace("userMail", userMail);
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void clickElement(ChromeDriver driver, By element) {
        driver.findElement(element).click();
    }

    public String getText(ChromeDriver driver, By element) {
        return driver.findElement(element).getText();
    }

    public void sendKeys(ChromeDriver driver, By element, String enterText) {
        driver.findElement(element).sendKeys(enterText);
    }
}
