package Pages;

import Elements.HbElements;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;
import util.ElementHelper;

import java.time.Duration;

public class HbPages extends DriverFactory {


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    Duration timeout;


    public HbPages(AppiumDriver driver) {
        this.driver = driver;
        this.timeout = Duration.ofSeconds(10);
        this.wait = new WebDriverWait(driver, timeout);
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickMyAccountButton() {

        elementHelper.findElement(HbElements.homePage).click();
        elementHelper.findElement(HbElements.myAccountButton).click();

    }


    //devam ve tamam
    public void clickLoginButton() {
        elementHelper.findElement(HbElements.loginButton).click();
        waitFor(5);
    }

    public void checkLoginButtonAvailable() {
        elementHelper.checkVisible(HbElements.secondLoginButton);
    }

    public void checkBoxAvailable() {
        elementHelper.checkVisible(HbElements.emailBox);
        waitFor(2);


    }

    public void writeEmail() {

        elementHelper.findElement(HbElements.emailBlank).click();
        elementHelper.findElement(HbElements.emailBlank).sendKeys("abcde");
        elementHelper.findElement(HbElements.loginButton).click();

    }

    public void checkErrorMessage(String error) {
        elementHelper.checkVisible(HbElements.errorMessage);

    }
}
