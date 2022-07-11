package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUp {
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUP;
@FindBy(xpath = "//input[@type='text']")private WebElement mobNo ;
@FindBy(xpath = "//button[@class='register-user']") private WebElement continu;
@FindBy(xpath = "//a[text()='Want to open an NRI account?']")private WebElement nRI;

public ZerodhaSignUp(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnSubmit() {
	signUP.click();
}
public void enterMOb(String num) {
	mobNo.sendKeys(num);
}
public void clickOnContinue() {
	continu.click();
}
public void clickONRI() {
	nRI.click();
}

}
