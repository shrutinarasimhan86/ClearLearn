package selenium.ClearLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage{
	 static WebDriver d = null;
	public WebElement TxtFld_Username = null;
	public WebElement TxtFld_Password = null;
	public WebElement Button_Submit = null;
	public WebElement MessageStack = null;
	public WebElement Link_Admin =null;
	public WebElement Link_Support = null;
	public WebElement Link_OnlineCatalog = null;
	
	public LoginPage(WebDriver driver) {
		d = driver;
	}
	
	public void SendValue_Username(String value){
		TxtFld_Username = d.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input"));
		TxtFld_Username.sendKeys(value);
	}
	public void SendValue_Password(String value){
		TxtFld_Password = d.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td/input"));
		TxtFld_Password.sendKeys(value);
	}
	public void Click_Submit(){
		Button_Submit = d.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]"));
		Button_Submit.click();
	}
	public void Click_Administration(){
		Link_Admin = d.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a[1]"));
		Link_Admin.click();
	}
	public void Click_SupportSite(){
		Link_Support = d.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a[3]"));
		Link_Support.click();
	}
	public void Click_OnlineCataog(){
		Link_OnlineCatalog = d.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a[2]"));
		Link_OnlineCatalog.click();
	}
	public String MessageErrorStack() {
		MessageStack = d.findElement(By.xpath("/html/body/table[1]/tbody/tr"));
		System.out.println("Message Error : "+MessageStack.getText());
		return MessageStack.getText();
	}
}