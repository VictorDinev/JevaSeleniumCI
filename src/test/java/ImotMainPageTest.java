import ImotTestsLogic.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.chromeDriver.getDriver;
import static Locators.Locators.*;

public class ImotMainPageTest {

    String expectedlabel = "Резултат от Вашето търсене на:";

    ChromeDriver driver = getDriver();
    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    User user = new UserBuilder().email("TestingMail")
            .password("153088")
            .build();

    @Test
    public void createUserAccount() {

        mainPage.waitForCokies(driver, proceedBtn, 10);
        mainPage.clickElement(driver, proceedBtn);
        mainPage.clickElement(driver, registerBtn);

        String actualText = registerPage.getText(driver, registerPage.getSelectRegisterTab());
        Assert.assertEquals(actualText, registerPage.getExpectedTabText());

        registerPage.sendKeys(driver, registerPage.getEmailField(), user.getEmail());
        registerPage.sendKeys(driver, registerPage.getPasswordField(), user.getPassword());
        registerPage.sendKeys(driver, registerPage.getRepeatPasswordField(), user.getPassword());
        registerPage.clickElement(driver, registerPage.getTermsOfUseBox());
        registerPage.clickElement(driver, registerPage.getRegisterBtn());
        registerPage.setUserMail(user.getEmail());
        String actualSuccessfulRegisterMsg = registerPage.getText(driver, registerPage.getSuccessMessage());
        Assert.assertEquals(actualSuccessfulRegisterMsg, registerPage.getExpectedSuccessfulRegisterMsg());
    }

    @Test
    public void login() {
//Тука брат неможах да го накара мда се логне с тея тестовите мейли щото сайта не им се кефи и не праща активационния код
        mainPage.waitForCokies(driver, proceedBtn, 10);
        mainPage.clickElement(driver, proceedBtn);
        mainPage.clickElement(driver, loginBtn);

        loginPage.clickElement(driver, loginPage.getRadioBtnUsers());
        loginPage.clickElement(driver, loginPage.getRememberMeCheckBox());
        loginPage.sendKeys(driver, loginPage.getEmailField(), user.getEmail());
        loginPage.sendKeys(driver, loginPage.getPasswordField(), user.getPassword());
        loginPage.clickElement(driver, loginPage.getLoginBtn());
    }

    @Test
    public void TestSearchSimple() {

        String expectedText = "Резултат от Вашето търсене на:";
        String actualText = mainPage.mainPageTest(driver);

        Assert.assertEquals(actualText, expectedlabel);
    }

    @Test
    public void testSearch() {

        mainPage.waitForCokies(driver, proceedBtn, 10);
        mainPage.clickElement(driver, proceedBtn);
        mainPage.clickElement(driver, map);
        mainPage.clickElement(driver, mapContinueBtn);
        mainPage.clickElement(driver, typeOfSearch);
        mainPage.clickElement(driver, selectLocation);
        mainPage.clickElement(driver, selectArrow);
        mainPage.sendKeys(driver, maxPriceBox, "320000");
        mainPage.clickElement(driver, searchBtn);
        String labelText = mainPage.getText(driver, resultLabel);

        Assert.assertEquals(labelText, expectedlabel);
    }
}
