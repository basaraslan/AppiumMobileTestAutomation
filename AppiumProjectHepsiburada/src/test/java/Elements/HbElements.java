package Elements;


import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HbElements {

    public static By homePage = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Anasayfam\")");
    public static By myAccountButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Hesabım\")");

    public static By loginButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Giriş yap\")");

    public static By secondLoginButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"btnLogin\")");


    public static By emailBox = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"txtUserName\")");

    public static By emailBlank = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"txtUserName\")");


    public static By errorMessage = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Geçerli bir e-posta adresi girmelisiniz.\")");

}
