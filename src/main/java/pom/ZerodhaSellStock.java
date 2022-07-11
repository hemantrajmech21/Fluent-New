package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSellStock {
@FindBy(xpath = "//input[@type='text']")private WebElement searchBox;
@FindBy(xpath = "//span[text()='ONGC']") private WebElement ongc ;
@FindBy(css = "[class='button-orange sell']")private WebElement sell;
@FindBy(xpath= "//label[@for='radio-155']")private WebElement bse;
@FindBy(xpath= "//label[@for='radio-156']")private WebElement nse;
@FindBy(xpath= "//label[@for='radio-163']")private WebElement intraday;
@FindBy(xpath= "//label[@for='radio-164']")private WebElement longterm;
@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement quantity;
@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement price;
@FindBy(xpath= "//label[@for='radio-169']")private WebElement market;
@FindBy(xpath= "//label[@for='radio-170']")private WebElement limit;
@FindBy(xpath= "//label[@for='radio-172']")private WebElement sl;
@FindBy(xpath= "//label[@for='radio-173']")private WebElement slm;
@FindBy(xpath= "//span[@class='reload-margin icon icon-reload']")private WebElement refresh;
@FindBy(xpath = "//button[@type='submit']")private WebElement SELL;
@FindBy(xpath = "(//button[@type='button'])[3]")private WebElement cancel;
public ZerodhaSellStock(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterSearch(String search ) {
	searchBox.sendKeys(search);
	searchBox.sendKeys(Keys.ENTER);
}
public void clickOnONGC() throws InterruptedException {
	ongc.click();
	Thread.sleep(3000);
}
public void clickOnSell() {
	sell.click();
}
public void clickOnIntraday() {
	intraday.click();
}
public void enterQuantity(String qyt) {
	quantity.sendKeys(qyt);
}
public void enterPrice(String Price) {
	price.sendKeys(Price);
}
public void clickOnMarket() {
	market.click();
}
public void clickOnLimit() {
	limit.click();
}
public void clickOnSl() {
	sl.click();
}
public void clickOnSlm() {
	slm.click();
}

public void clickOnRefresh() {
	refresh.click();
}
public void clickOnSELL() {
	SELL.click();
}
public void clickOnCancel() {
	cancel.click();
}
}
