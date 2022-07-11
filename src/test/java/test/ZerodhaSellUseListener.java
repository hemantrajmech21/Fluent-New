package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.BaseClass;
import utility.Exel;

@Listeners(utility.Listeners.class)
public class ZerodhaSellUseListener extends BaseClass {
	@BeforeMethod
	public void OpenBrowser() {
		driver=Browser.OpenB("https://kite.zerodha.com/");
	}
    @Test
    public void LoginToZerodha() throws EncryptedDocumentException, IOException {
    	driver = Browser.OpenB("https://kite.zerodha.com/");
    	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
    	String userId = Exel.getData("Kite_Log", 0, 0);
    	String pass = Exel.getData("Kite_Log", 1, 1);
    	String pin = Exel.getData("Kite_Log", 1, 0);
    	zerodhaLoginPage.EnterUserName(userId);
    	zerodhaLoginPage.EnterPassword(pass);
    	zerodhaLoginPage.ClickOnLogIn();
    	zerodhaLoginPage.EntePin(pin, driver);
    	zerodhaLoginPage.ClickOnContinue();
    }
}
