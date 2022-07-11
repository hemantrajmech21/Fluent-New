package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Exel;
import utility.ScreenShot;

public class ZerodhaLogInAssert {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		driver = Browser.OpenB("https://kite.zerodha.com/");	
	}
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId = Exel.getData("Kite_Log", 0, 1);
		String pass = Exel.getData("Kite_Log", 1, 1);
		String pin = Exel.getData("Kite_Log", 2, 1);
		boolean pic = zerodhaLoginPage.isImageDisplay();
//		Assert.assertTrue(pic); //hard assert
		SoftAssert softAssert = new SoftAssert();  // soft assert
		softAssert.assertTrue(pic);;
		zerodhaLoginPage.EnterUserName(userId);
		zerodhaLoginPage.EnterPassword(pass);
		zerodhaLoginPage.ClickOnLogIn();
		zerodhaLoginPage.EntePin(pin, driver);
		zerodhaLoginPage.ClickOnContinue();
		softAssert.assertAll();
		
	}
	public void SCreenShot() throws IOException {
		ScreenShot.takeScreenshot(driver, "zerodha");
	}
	
}
