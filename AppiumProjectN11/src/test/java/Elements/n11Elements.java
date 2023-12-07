package Elements;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;

public class n11Elements {


  public static By categoryButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
  public static By electronicButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Elektronik\")\n");

  public static By telephoneAccess = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Telefon & Aksesuarları\")");


  public static By cellPhoneButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Cep Telefonu\")");

  public static By brandButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Apple\")");

  public static By filterButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Filtrele\")");

public static By storingButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");

public static By storingSize = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"128 GB\")");

public static By applyButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Uygula\")");

public static By colorButton = new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Renk" + "\").instance(0))");



public static By color= new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Mavi\")");


public static By modelButton= new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + "Model" + "\").instance(0))");

public static By model = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Iphone 13\")");

public static By showResultButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");



  public static By addBasketButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");

  public static By continueButton = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/continueButton\")");
  public static By myBasket = new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
  public static By checkProduct = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");



}
