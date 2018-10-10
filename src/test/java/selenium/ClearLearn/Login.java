package selenium.ClearLearn;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.ClearLearn.LoginPage;

public class Login{
	static WebDriver d;
	
	
	//@Test(dataProvider = "Authentication")
	@Test
	 public void LoginTest() {
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 d.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=89gbph9al0mugr1ta7k3eirll0");
		/* d.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input")).sendKeys("admin");
		 d.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td/input")).sendKeys("admin@123");
		 d.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();*/
		 LoginPage Lg = new LoginPage(d);
		  Lg.SendValue_Username("admn");
		  Lg.SendValue_Password("admin@123");
		  Lg.Click_Submit();
		  AfterLoginPage Alg = new AfterLoginPage(d);
		  if(Alg.CheckLoginSucess()== true) {
			  System.out.println("Login was successful!!");
		  }
		  else {
			  System.out.println("Login was NOT successful!!");
		  System.out.println(Lg.MessageErrorStack());
		  }
		/* d.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		  if(d.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText()!=null) {
			  System.out.println("Error message : "+ d.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText());
		  }
		  else {
			  if(d.findElement(By.xpath("//*[@id=\"adminAppMenu\"]/h3[1]/a")).isDisplayed()) {
				  System.out.println("We have logged in");
			  }
			  else System.out.println("there was some error");
		  }*/
		  
	  }
	@BeforeMethod
	  public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mishu\\Desktop\\Shruti\\Work\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		        d = new ChromeDriver();
		  		d.manage().window().maximize();
		  		
		  	}
	
	/* @DataProvider(name = "Authentication")
	  public static Object[][] credentials() throws BiffException, FileNotFoundException, IOException {
		  
	   //   return new Object[][] { { "admin", "admin@123" }, { "testuser_1", "Test@123" }};
		  
		  Workbook wb = Workbook.getWorkbook(new FileInputStream("C:\\Users\\mishu\\Desktop\\Shruti\\Work\\Class Notes\\Test123.xls"));
			Sheet sh = wb.getSheet(0);
			int rows = sh.getRows();
			int colm = sh.getColumns();
			String[][] Data= new String[rows-1][colm];
			for(int i=1; i<rows; i++) //Loop work for Rows
	        {  
	            for (int j=0; j<colm; j++) //Loop work for colNum
	            {
	            	Data[i-1][j]=sh.getCell(j, i).getContents();
	            }
	        }

			//Object[][] arrayObject = Data;
			//return arrayObject;
			return Data;

	  }*/
	  
	  @AfterMethod
	  public void closeBrowser() {
		  		
		  		d.close();
		  	}

	
}