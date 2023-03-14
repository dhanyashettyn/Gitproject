package testPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentWikipedia {
	WebDriver driver;
  @Test
  public void OpenApp() throws InterruptedException 
  {
	  String expectedTitle = "Wikipedia, the free encyclopedia";
	  String actualTitle = null;
	 // String baseUrl = "http://www.wikipedia.org";
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver_win110\\chromedriver.exe\\");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.wikipedia.org");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("js-link-box-en")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("search")).sendKeys("Selenium");
	  Thread.sleep(3000);
	  System.out.println(driver.getTitle());
	  
	 actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
  }
}
