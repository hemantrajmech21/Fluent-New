package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaHomePage {
@FindBy(xpath = "//input[@icon='search']")private WebElement search;
@FindBy(xpath = "//span[@class='nice-name']")private List<WebElement> shares ;
@FindBy(xpath = "[class='button-blue buy']")private WebElement watchListBuy;

public ZerodhaHomePage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void enterStockToSearch(String StockName) {
	search.sendKeys(StockName);
}
public void selectShareFromWatchlist(String shareName,WebDriver driver) 
{
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(3000));
	wait.until(ExpectedConditions.visibilityOf(search));
	System.out.println(shares.size());
	
	for(int i=0;i<shares.size();i++) 
	{
		WebElement stock = shares.get(i);
		String stockNAME = stock.getText();
		if(stockNAME.equals(shareName)) {
			Actions action = new Actions(driver);
			action.moveToElement(stock);
			action.perform();
		  }
	}	
}
public void ClickOnWatchListBuyStock() throws InterruptedException {
	Thread.sleep(3000);
	watchListBuy.click();
}

}
