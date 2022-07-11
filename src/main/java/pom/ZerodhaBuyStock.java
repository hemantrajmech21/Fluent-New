package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaBuyStock {
@FindBy(xpath = "//input[@icon='search']")private WebElement searchBox;
@FindBy(xpath = "//span[text()='TATACOFFEE']") private WebElement tataCoff ;
@FindBy(css = "[class='button-blue buy']")private WebElement buy;
@FindBy(xpath = "//label[@for='radio-3780']")private WebElement bse;
@FindBy(xpath = "//label[@for='radio-3781']")private WebElement nse;
@FindBy(xpath = "//label[@for='radio-3788']")private WebElement intraDay;
@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement qyt;
@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement price;
@FindBy(xpath = "//label[@for='radio-3794']")private WebElement market;
@FindBy(xpath = "//label[@for='radio-3795']")private WebElement limit;
@FindBy(xpath = "//label[@for='radio-3797']")private WebElement sl;
@FindBy(xpath = "//label[@for='radio-3798']")private WebElement slm;
@FindBy(xpath = "//span[@data-balloon='More options']") private WebElement moreOption;
@FindBy(xpath = "(//span[@class='su-checkbox-value'])[2]") private WebElement target;
@FindBy(xpath = "//a[@data-balloon='Refresh']")private WebElement refresh;
@FindBy(xpath = "//button[@type='submit']")private WebElement BUY;
@FindBy(xpath = "(//button[@type='button'])[3]")private WebElement cancel;
public ZerodhaBuyStock(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterSearch(String search ) {
	searchBox.sendKeys(search);
	searchBox.sendKeys(Keys.ENTER);
}
public void clickOnTataCoff() throws InterruptedException {
	tataCoff.click();
	Thread.sleep(3000);
}
public void clickOnBuy() {
	buy.click();
}
public void clickOnIntraday() {
	intraDay.click();
}
public void enterQuantity(String quantity) {
	qyt.sendKeys(quantity);
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
public void clickOnMoreOption() {
	moreOption.click();
}
public void clickOnRefresh() {
	refresh.click();
}
public void clickOnBye() {
	BUY.click();
}
public void clickOnCancel() {
	cancel.click();
}
}
