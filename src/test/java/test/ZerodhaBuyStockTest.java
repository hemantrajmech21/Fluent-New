package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaBuyStock;
import pom.ZerodhaLoginPage;
import utility.Exel;
import utility.ScreenShot;

public class ZerodhaBuyStockTest {
WebDriver driver;
@BeforeMethod
public void OpenBrowser() {
	driver = Browser.OpenB("https://kite.zerodha.com/");
}
@Test
public void BuyStock() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userId = Exel.getData("Kite_Log", 0, 1);
	String pass = Exel.getData("Kite_Log", 1, 1);
	String pin = Exel.getData("Kite_Log", 2, 1);
	zerodhaLoginPage.EnterUserName(userId);
	zerodhaLoginPage.EnterPassword(pass);
	zerodhaLoginPage.ClickOnLogIn();
	Thread.sleep(3000);
	zerodhaLoginPage.EntePin(pin, driver);
	zerodhaLoginPage.ClickOnContinue();	
	ZerodhaBuyStock zerodhaBuyStock = new ZerodhaBuyStock(driver);
	zerodhaBuyStock.enterSearch("TATACOFFEE");
	zerodhaBuyStock.clickOnTataCoff();
	zerodhaBuyStock.clickOnBuy();
	zerodhaBuyStock.enterQuantity("1");
	zerodhaBuyStock.enterPrice("197");
	zerodhaBuyStock.clickOnBye();
}
@AfterMethod
public void SCReenShot() throws IOException {
	ScreenShot.takeScreenshot(driver, "Zerodha");
}
}
