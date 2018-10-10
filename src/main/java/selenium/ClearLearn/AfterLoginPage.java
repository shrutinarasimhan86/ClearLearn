package selenium.ClearLearn;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AfterLoginPage {
	static WebDriver d;
	public WebElement Link_Catalog = null;
	public WebElement Link_Manufactures = null;
	public WebElement Link_Reviews = null;
	public WebElement Link_Customers = null;
	public WebElement Link_Orders = null;
	public WebElement Link_Currencies = null;
	public WebElement Link_OrderStatus = null;
	public WebElement Link_ProductViewed = null;
	public WebElement Link_ProductPurchased = null;
	public WebElement Link_CustomerOrdersTotal = null;
	public WebElement Link_Admin =null; 
	public WebElement Link_Support = null;
	public WebElement Link_OnlineCatalog = null;
	
	public AfterLoginPage(WebDriver driver) {
		d = driver;
	}

	public void Click_Catalog() {
		Link_Catalog = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[1]/ul/li[1]/a"));
		Link_Catalog.click();
	}
	public void Click_Manufactures() {
		Link_Manufactures = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[1]/ul/li[2]/a"));
		Link_Manufactures.click();
	}
	public void Click_Reviews() {
		Link_Reviews = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[1]/ul/li[3]/a"));
		Link_Reviews.click();
	}
	public void Click_Customers() {
		Link_Customers = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[2]/ul/li[1]/a"));
		Link_Customers.click();
	}
	public void Click_Orders() {
		Link_Orders = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[2]/ul/li[1]/a"));
		Link_Orders.click();
	}
	public void Click_Currencies() {
		Link_Currencies = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[3]/ul/li[1]/a"));
		Link_Currencies.click();
	}
	public void Click_OrderStatus() {
		Link_OrderStatus = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[3]/ul/li[2]/a"));
		Link_OrderStatus.click();
	}
	
	public void Click_ProductViewed() {
		Link_ProductViewed = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[4]/ul/li[1]/a"));
		Link_ProductViewed.click();
	}
	public void Click_ProductPurchased() {
		Link_ProductPurchased = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[4]/ul/li[2]/a"));
		Link_ProductPurchased.click();
	}
	public void Click_CustomerOrdersTotal() {
		Link_CustomerOrdersTotal = d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/div[4]/ul/li[3]/a"));
		Link_CustomerOrdersTotal.click();
	}

	public boolean CheckLoginSucess() {
		try {
		if (d.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]")).isDisplayed()) {
			if (d.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]")).getText().contains("Logged in as")) {
				return true;
			} else
				return false;
		}else
			return false;
	}catch (NoSuchElementException e) {
		return false;
	}
	
}
}
