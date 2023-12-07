package Pages;

import Elements.n11Elements;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class n11Pages {


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    Duration timeout;


    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.timeout = Duration.ofSeconds(10);
        this.wait = new WebDriverWait(driver, timeout);
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickCategoryButton() {
        elementHelper.findElement(n11Elements.categoryButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickElectronic() {
        elementHelper.findElement(n11Elements.electronicButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickTelephoneAccessory() {
        elementHelper.findElement(n11Elements.telephoneAccess).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectTelephone() {
        elementHelper.findElement(n11Elements.cellPhoneButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectBrand() {
        elementHelper.findElement(n11Elements.brandButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickFilter() {

        elementHelper.findElement(n11Elements.filterButton).click();
    }

    public void makeFilter() {
        //filtre1
        elementHelper.findElement(n11Elements.storingButton).click();
        elementHelper.findElement(n11Elements.storingSize).click();
        elementHelper.findElement(n11Elements.applyButton).click();

        //filtre2
        elementHelper.findElement(n11Elements.colorButton).click();
        elementHelper.findElement(n11Elements.color).click();
        elementHelper.findElement(n11Elements.applyButton).click();

        //filtre3
        elementHelper.findElement(n11Elements.modelButton).click();
        elementHelper.findElement(n11Elements.model).click();
        elementHelper.findElement(n11Elements.applyButton).click();

    }

    public void clickResultButton() {
        elementHelper.findElement(n11Elements.showResultButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickAddChartButton() {

        elementHelper.findElement(n11Elements.addBasketButton).click();

        elementHelper.findElement(n11Elements.continueButton).click();
    }

    public void clickChartButton() {
        elementHelper.findElement(n11Elements.myBasket).click();
    }

    public void viewDesired() {

        elementHelper.checkVisible(n11Elements.checkProduct);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
