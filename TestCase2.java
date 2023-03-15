package testPackage1;

//added new line
//added previous line
//Double check this line which added now

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void validatePageTitle() {
	  
	  
	  String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	  String expectedTitle = "Web Orders";
	  String actualTitle = null;
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	  
	  driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
	   driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
		
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
  }
}
