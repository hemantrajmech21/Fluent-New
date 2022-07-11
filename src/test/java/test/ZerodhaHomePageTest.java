package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Exel;

public class ZerodhaHomePageTest {
WebDriver driver;

@BeforeMethod
public void OpenBrowserLoginToZerodha() throws EncryptedDocumentException, IOException, InterruptedException {
	driver = Browser.OpenB("https://kite.zerodha.com/");
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userId = Exel.getData("Kite_Log", 0, 1);
	String pass = Exel.getData("Kite_Log", 1, 1);
	String pin = Exel.getData("Kite_Log", 2, 1);
	zerodhaLoginPage.EnterUserName(userId);
	zerodhaLoginPage.EnterPassword(pass);
	zerodhaLoginPage.ClickOnLogIn();
	zerodhaLoginPage.EntePin(pin, driver);
	zerodhaLoginPage.ClickOnContinue();
	
}
@Test
public void buyFromWatchList() {
	ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
	zerodhaHomePage.selectShareFromWatchlist("TCS", driver);
}

}
