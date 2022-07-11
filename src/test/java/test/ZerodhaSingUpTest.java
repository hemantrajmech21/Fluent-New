package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSignUp;
import utility.Exel;
import utility.ScreenShot;

public class ZerodhaSingUpTest {
WebDriver driver;
String signUp;
@BeforeMethod
public void OpenBROwser() {
	driver = Browser.OpenB("https://kite.zerodha.com/");
	String singUp = driver.getWindowHandle();
}
@Test
public void signUpTest() throws EncryptedDocumentException, IOException {
	ZerodhaSignUp zerodhaSignUp = new ZerodhaSignUp(driver);
	zerodhaSignUp.clickOnSubmit();
	
	Set<String> handle = driver.getWindowHandles();
	Iterator<String> i = handle.iterator();
	String handle1 = i.next();
	System.out.println(handle1);
	String handle2 = i.next();
	System.out.println(handle2);
	driver.switchTo().window(handle2);
	String mob = Exel.getData("Kite_Log", 0, 1);
	zerodhaSignUp.enterMOb(mob);
	zerodhaSignUp.clickOnContinue();	
}
public void SCreenshot() throws IOException {
	ScreenShot.takeScreenshot(driver, "SignUp");
}
}
