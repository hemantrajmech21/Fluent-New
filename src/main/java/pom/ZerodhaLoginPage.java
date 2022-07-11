package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	 @FindBy(xpath = "//input[@type='text']") private WebElement username;
	   @FindBy(xpath = "//input[@type='password']") private WebElement password;
	   @FindBy(xpath = "//button[@type='submit']")private WebElement logIn;
	   @FindBy(xpath = "//a[text()='Forgot user ID or password?']")private WebElement forgot;
	   @FindBy(xpath = "//input[@label='PIN']")private WebElement pin;
	   @FindBy(xpath = "//button[@type='submit']")private WebElement contiNue;
	   @FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement submit;
	   @FindBy(xpath = "//img[@alt='Kite']")private WebElement image;
	   
	   
	   public ZerodhaLoginPage(WebDriver driver) 
	   {
		   PageFactory.initElements(driver, this);
	   }
	   public void EnterUserName(String UserName) 
	   {
		   username.sendKeys(UserName);
	   }
	   public void EnterPassword(String pass) {
		   password.sendKeys(pass);
	   }
	   public void ClickOnLogIn() 
	   {
		   logIn.click();
	   }
	   public void ClickOnForgot()
	   {
		   forgot.click();
	   }
	   public void clickOnSubmit() {
		   submit.click();
	   }
	   public void EntePin(String Pin,WebDriver driver) 
	   {
		   FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		   wait.withTimeout(Duration.ofMillis(5000));
		   wait.pollingEvery(Duration.ofMillis(100));
		   wait.ignoring(Exception.class);
		   wait.until(ExpectedConditions.visibilityOf(pin));
		   pin.sendKeys(Pin);
		   //we check the visibility of element evry 500 milisec
	   }
	   public void ClickOnContinue() 
	   {
		   contiNue.click();
	   }
	   public boolean isImageDisplay() {
		  return image.isDisplayed();
	   }
	}


